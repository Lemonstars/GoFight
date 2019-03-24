package ui.panel;

import model.thing.hero.AbstractHero;
import model.thing.hero.commond.*;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class OperationPanel extends JPanel{

    private AbstractHero hero;

    private CommandInvoker commandInvoker;

    private JButton[] directionButton = new JButton[4];
    private String[] directionStr = {"上", "下", "左", "右"};

    private JButton[] settingButton = new JButton[3];
    private String[] settingStr = {"保存进度", "退出游戏", "重新开始"};

    public OperationPanel(AbstractHero hero) {
        this.hero = hero;

        this.setBounds(800, 200, 200, 400);
        this.setLayout(null);
        this.setBackground(new Color(91, 213, 255));

        configDirectionButton();
        configSettingButton();
        configListener();

        this.setVisible(true);
    }

    private void configDirectionButton(){
        for(int i=0; i<directionButton.length; i++){
            directionButton[i] = new JButton();
            directionButton[i].setText(directionStr[i]);

            int x = i < 2 ? 75: 25 + 100 * (i-2);
            int y = i < 2 ? 25 + 100 * i: 75;
            int size = 50;
            directionButton[i].setBounds(x, y, size, size);
            this.add(directionButton[i]);
        }

    }

    private void configSettingButton(){
        for(int i=0; i<settingButton.length; i++){
            settingButton[i] = new JButton();
            settingButton[i].setText(settingStr[i]);

            int x = 50;
            int y = 210 + 60 * i;
            int width = 100;
            int height = 50;
            settingButton[i].setBounds(x, y, width, height);
            this.add(settingButton[i]);
        }

    }

    private void configListener(){
        commandInvoker = new CommandInvoker();
        directionButton[0].addActionListener(e -> {
            commandInvoker.setCommand(new UpCommand(hero));
            commandInvoker.invoke();
        });
        directionButton[1].addActionListener(e -> {
            commandInvoker.setCommand(new DownCommand(hero));
            commandInvoker.invoke();
        });
        directionButton[2].addActionListener(e -> {
            commandInvoker.setCommand(new LeftCommand(hero));
            commandInvoker.invoke();
        });
        directionButton[3].addActionListener(e -> {
            commandInvoker.setCommand(new RightCommand(hero));
            commandInvoker.invoke();
        });

    }

}
