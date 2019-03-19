package ui;

import model.floor.FirstFloor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class MapPanel extends JPanel{

    private Image wallImage;
    private Image tileImage;

    public MapPanel() {
        this.setBounds(0, 0, 800, 400);
        this.setLayout(null);
        this.setBackground(new Color(106, 106, 106));

        configBasicMap();

        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int size = 40;

        FirstFloor firstFloor = new FirstFloor();
        int[][] distribution = firstFloor.getFloorDistribution();

        for(int i=0; i<distribution.length; i++){
            for(int j=0; j<distribution[0].length; j++){
                // todo
                if(distribution[i][j] == 0){
                    g.drawImage(wallImage, size * j, size * i, size, size,null);
                }else {
                    g.drawImage(tileImage, size * j, size * i, size, size,null);
                }
            }
        }
    }

    private void configBasicMap(){
        try {
            Class clazz = getClass();
            ClassLoader loader = clazz.getClassLoader();
            wallImage = ImageIO.read(loader.getResource("pic/wall.png"));
            tileImage = ImageIO.read(loader.getResource("pic/tile.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
