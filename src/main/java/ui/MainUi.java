package ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class MainUi {

    private int x;
    private int y;
    private int width = 1000;
    private int height = 600;

    public MainUi() {
        computeLocation();

        JFrame jFrame = new JFrame("Go-Fight");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setBounds(x, y, width, height);
        jFrame.setResizable(false);

        addPanel(jFrame, new MapPanel());
        addPanel(jFrame, new RolePanel());
        addPanel(jFrame, new InfoPanel());
        addPanel(jFrame, new OperationPanel());

        jFrame.setVisible(true);
    }

    private void computeLocation(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        this.x = (screenWidth - width) / 2;
        this.y = (screenHeight - height) / 2;
    }

    private void addPanel(JFrame jFrame, JPanel jPanel){
        jFrame.getContentPane().add(jPanel);
    }

}
