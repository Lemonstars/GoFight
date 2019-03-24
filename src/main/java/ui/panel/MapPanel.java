package ui.panel;

import constant.MapConstant;
import data.NotificationContent;
import model.floor.Floor;
import model.thing.IThing;
import model.thing.ThingFactory;
import model.thing.ThingType;
import model.thing.hero.AbstractHero;
import util.ImageIconUtil;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class MapPanel extends JPanel implements Observer{

    private AbstractHero hero;
    private JLabel[][] mapLabelArray;

    public MapPanel(AbstractHero hero) {
        this.hero = hero;
        this.hero.addObserver(this);
        this.setBounds(0, 0, 800, 400);

        GridLayout groupLayout = new GridLayout(MapConstant.ROW, MapConstant.COL);
        this.setLayout(groupLayout);

        configMapLabel();
        configMapLabelIcon();
        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        NotificationContent content = (NotificationContent)arg;
        if(content.isFloorChanged()){
            configMapLabelIcon();
        }else {
            updateLabel(content.getOldX(), content.getOldY(), content.getNewX(), content.getNewY());
        }
    }

    private void configMapLabel(){
        mapLabelArray = new JLabel[MapConstant.ROW][MapConstant.COL];
        for(int i = 0; i< mapLabelArray.length; i ++){
            for(int j = 0; j< mapLabelArray[0].length; j++){
                mapLabelArray[i][j] = new JLabel();
                this.add(mapLabelArray[i][j]);
            }
        }
    }

    private void configMapLabelIcon(){
        Floor floor = hero.getFloor();
        IThing[][] distribution = floor.getFloorDistribution();
        String fileUrl;

        for(int i = 0; i< mapLabelArray.length; i ++){
            for(int j = 0; j< mapLabelArray[0].length; j++){
                fileUrl = distribution[i][j].getPicName();
                mapLabelArray[i][j].setIcon(ImageIconUtil.create(fileUrl));
            }
        }
    }

    private void updateLabel(int oldX, int oldY, int newX, int newY){
        IThing hero = ThingFactory.create(ThingType.HERO);
        IThing tile = ThingFactory.create(ThingType.TILE);
        mapLabelArray[newX][newY].setIcon(ImageIconUtil.create(hero.getPicName()));
        mapLabelArray[oldX][oldY].setIcon(ImageIconUtil.create(tile.getPicName()));
    }


}
