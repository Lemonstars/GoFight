package ui.panel;

import data.NotificationContent;
import model.thing.hero.AbstractHero;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/18
 */
public class RolePanel extends JPanel implements Observer{

    private AbstractHero hero;

    private JLabel[] roleLabel = new JLabel[6];
    private JLabel[] valueLabel = new JLabel[6];
    private String[] roleStr = {"角色", "金币",  "经验", "生命值", "攻击值", "防守值"};
    private String[] valueStr = new String[roleStr.length];

    public RolePanel(AbstractHero hero) {
        this.hero = hero;
        this.hero.addObserver(this);

        this.setBounds(800, 0, 200, 200);
        this.setLayout(null);
        this.setBackground(new Color(186, 231, 255));

        configHintLabel();
        configHintContent();

        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        NotificationContent content = (NotificationContent)arg;
        if(content.isRoleChanged()){
            configHintContent();
        }
    }

    private void configHintLabel(){
        for(int i = 0; i< roleLabel.length; i++){
            roleLabel[i] = new JLabel();
            roleLabel[i].setText(roleStr[i]);

            valueLabel[i] = new JLabel();

            int roleX = 30;
            int valueX = 110;
            int y = 10 + 30 * i;
            int width = 50;
            int height = 30;

            roleLabel[i].setBounds(roleX, y, width, height);
            valueLabel[i].setBounds(valueX, y, width, height);
            this.add(roleLabel[i]);
            this.add(valueLabel[i]);
        }
    }

    private void configHintContent(){
        valueStr[0] = hero.getDescription();
        valueStr[1] = String.valueOf(hero.getMoney());
        valueStr[2] = String.valueOf(hero.getExperience());
        valueStr[3] = String.valueOf(hero.getBlood());
        valueStr[4] = String.valueOf(hero.getAttack());
        valueStr[5] = String.valueOf(hero.getDefence());

        for(int i=0; i<valueLabel.length; i++){
            valueLabel[i].setText(valueStr[i]);
            valueLabel[i].updateUI();
        }

    }



}