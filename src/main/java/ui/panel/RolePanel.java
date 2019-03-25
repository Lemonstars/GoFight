package ui.panel;

import data.NotificationContent;
import model.floor.Floor;
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

    private String[] roleStr = {"楼层", "角色", "金币",  "经验", "生命值", "攻击值", "防守值"};
    private String[] valueStr = new String[roleStr.length];
    private JLabel[] roleLabel = new JLabel[roleStr.length];
    private JLabel[] valueLabel = new JLabel[roleStr.length];

    public RolePanel(AbstractHero hero) {
        hero.addObserver(this);

        this.setBounds(800, 0, 200, 200);
        this.setLayout(null);
        this.setBackground(new Color(186, 231, 255));

        configHintLabel();
        configHintContent(hero);

        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        NotificationContent content = (NotificationContent)arg;
        if(content.isRoleChanged()){
            AbstractHero hero = content.getHero();
            configHintContent(hero);
        }
    }

    private void configHintLabel(){
        for(int i = 0; i< roleLabel.length; i++){
            roleLabel[i] = new JLabel();
            roleLabel[i].setText(roleStr[i]);

            valueLabel[i] = new JLabel();

            int roleX = 30;
            int valueX = 110;
            int y = 5 + 27 * i;
            int width = 50;
            int height = 25;

            roleLabel[i].setBounds(roleX, y, width, height);
            valueLabel[i].setBounds(valueX, y, width, height);
            this.add(roleLabel[i]);
            this.add(valueLabel[i]);
        }
    }

    private void configHintContent(AbstractHero hero){
        Floor floor = hero.getFloor();
        int level = floor.getLevel();
        valueStr[0] = "第" + level + "层";
        valueStr[1] = hero.getDescription();
        valueStr[2] = String.valueOf(hero.getMoney());
        valueStr[3] = String.valueOf(hero.getExperience());
        valueStr[4] = String.valueOf(hero.getBlood());
        valueStr[5] = String.valueOf(hero.getAttack());
        valueStr[6] = String.valueOf(hero.getDefence());

        for(int i=0; i<valueLabel.length; i++){
            valueLabel[i].setText(valueStr[i]);
            valueLabel[i].updateUI();
        }

    }



}
