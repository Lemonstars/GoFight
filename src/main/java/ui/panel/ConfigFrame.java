package ui.panel;

import model.floor.FloorFactory;
import model.thing.ThingFactory;
import model.thing.hero.AbstractHero;
import ui.frame.BattleFrame;
import util.ImageIconUtil;
import util.LocationUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public class ConfigFrame extends JFrame {

    public ConfigFrame() throws HeadlessException {
        init();
    }

    private void init(){
        int width = 500;
        int height = 300;
        int x = LocationUtil.computeLocationX(width);
        int y = LocationUtil.computeLocationY(height);

        setTitle("Go-Fight");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(x, y, width, height);
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);

        initTower();
        initChoiceButton();

        setVisible(true);
    }

    private void initTower(){
        int width = 200;
        int height = 100;
        int x = 150;
        int y = 50;
        ImageIcon imageIcon = ImageIconUtil.create(width, height,"tower.png");
        JLabel jLabel = new JLabel(imageIcon);
        jLabel.setBounds(x, y, width, height);
        add(jLabel);
        jLabel.setVisible(true);
    }

    private void initChoiceButton(){
        Font font = new Font("宋体", Font.PLAIN, 15);
        JLabel jLabel = new JLabel("请选择英雄角色", JLabel.CENTER);
        jLabel.setFont(font);
        jLabel.setBounds(190, 155, 120,  50);
        jLabel.setForeground(Color.WHITE);
        add(jLabel);
        jLabel.setVisible(true);

        JButton attacker = new JButton();
        attacker.setText("攻击型");
        int width = 80;
        int height = 40;
        attacker.setBounds(150, 200, width, height);
        add(attacker);
        setVisible(true);

        // todo 配置界面消失
        attacker.addActionListener(e -> {
            AbstractHero hero = ThingFactory.createAttacker(FloorFactory.createFloor(1));
            hero.locate();
            ConfigFrame.this.dispose();
            new BattleFrame(hero);
        });

        JButton defender = new JButton();
        defender.setText("防守型");
        defender.setBounds(270, 200, width, height);
        add(defender);
        setVisible(true);
        defender.addActionListener(e -> {
            AbstractHero hero = ThingFactory.createDefencer(FloorFactory.createFloor(1));
            hero.locate();
            ConfigFrame.this.dispose();
            new BattleFrame(hero);
        });
    }



}
