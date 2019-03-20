package ui;

import model.floor.Floor;
import model.floor.FloorFactory;
import model.thing.ThingPic;
import model.thing.ThingType;
import util.ImageUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class MapPanel extends JPanel{

    public MapPanel() {
        this.setBounds(0, 0, 800, 400);
        this.setLayout(null);
        this.setBackground(new Color(106, 106, 106));

        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int size = 40;

        FloorFactory floorFactory = new FloorFactory();
        Floor firstFloor = floorFactory.createFloor(1);
        ThingType[][] distribution = firstFloor.getFloorDistribution();

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
