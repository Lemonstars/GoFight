package ui.frame;

import model.thing.hero.AbstractHero;
import ui.panel.InfoPanel;
import ui.panel.MapPanel;
import ui.panel.OperationPanel;
import ui.panel.RolePanel;
import util.LocationUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public class BattleFrame extends JFrame{

    public static final String COMMAND_FILE_NAME = "command" + System.currentTimeMillis() + ".txt";

    public BattleFrame(AbstractHero hero) throws HeadlessException {
        init(hero);
    }

    private void init(AbstractHero hero){
        int width = 1000;
        int height = 600;
        int x = LocationUtil.computeLocationX(width);
        int y = LocationUtil.computeLocationY(height);

        setTitle("Go-Fight");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(x, y, width, height);
        setResizable(false);

        getContentPane().add(new MapPanel(hero));
        getContentPane().add(new RolePanel(hero));
        getContentPane().add(new InfoPanel(hero));
        getContentPane().add(new OperationPanel(hero));

        setVisible(true);
    }

}
