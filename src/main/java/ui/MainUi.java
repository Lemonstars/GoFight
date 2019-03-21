package ui;

import model.hero.AbstractHero;
import model.hero.AttackerHero;
import ui.panel.InfoPanel;
import ui.panel.MapPanel;
import ui.panel.OperationPanel;
import ui.panel.RolePanel;

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

        // todo 如何选择角色类型
        AbstractHero hero = new AttackerHero();

        addPanel(jFrame, new MapPanel(hero));
        addPanel(jFrame, new RolePanel(hero));
        addPanel(jFrame, new InfoPanel(hero));
        addPanel(jFrame, new OperationPanel(hero));

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
