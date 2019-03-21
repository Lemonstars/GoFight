package ui.panel;

import model.floor.Floor;
import model.hero.AbstractHero;
import model.thing.ThingPic;
import model.thing.ThingType;
import util.ImageUtil;

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

    private int size = 40;
    private AbstractHero hero;

    public MapPanel(AbstractHero hero) {
        this.hero = hero;
        this.hero.addObserver(this);

        this.setBounds(0, 0, 800, 400);
        this.setLayout(null);
        this.setBackground(new Color(106, 106, 106));

        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("MapPanel: I know that I should update");
        updateUI();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Floor floor = hero.getFloor();
        ThingType[][] distribution = floor.getFloorDistribution();

        String fileUrl;
        Image image;
        for(int i=0; i<distribution.length; i++){
            for(int j=0; j<distribution[0].length; j++){
                fileUrl = "pic/" + ThingPic.convertType2PicName(distribution[i][j]);
                image = ImageUtil.getImage(fileUrl);
                g.drawImage(image, size * j, size * i, size, size,null);
            }
        }
    }

}
