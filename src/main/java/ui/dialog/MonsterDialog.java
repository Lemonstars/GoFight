package ui.dialog;

import model.thing.ThingFactory;
import model.thing.ThingType;
import model.thing.monster.AbstractMonster;
import util.LocationUtil;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public class MonsterDialog extends JDialog{

    public MonsterDialog(String title) {
        init(title);
    }

    private void init(String title){
        int monsterNum = 6;
        GridLayout gridLayout = new GridLayout(monsterNum + 1, 6);

        int width = 600;
        int height = 360;
        int x = LocationUtil.computeLocationX(width);
        int y = LocationUtil.computeLocationY(height);
        setLayout(gridLayout);
        setTitle(title);
        setBounds(x, y, width, height);
        setModal(true);

        AbstractMonster bat = (AbstractMonster)ThingFactory.create(ThingType.BAT);
        AbstractMonster skeleton = (AbstractMonster)ThingFactory.create(ThingType.SKELETON);
        AbstractMonster shrek_red = (AbstractMonster)ThingFactory.create(ThingType.SHREK_RED);
        AbstractMonster shrek_blue = (AbstractMonster)ThingFactory.create(ThingType.SHREK_BLUE);
        AbstractMonster shrek_black = (AbstractMonster)ThingFactory.create(ThingType.SHREK_BLACK);
        AbstractMonster corpse = (AbstractMonster)ThingFactory.create(ThingType.CORPSE);
        AbstractMonster[] monsterArray = {bat, skeleton, shrek_red, shrek_blue, shrek_black, corpse};

        List<String> monsterHint = new ArrayList();
        monsterHint.add("名称");
        monsterHint.add("攻击力");
        monsterHint.add("防御力");
        monsterHint.add("血量");
        monsterHint.add("金币");
        monsterHint.add("经验");

        for(AbstractMonster monster: monsterArray){
            monsterHint.add(monster.getDescription());
            monsterHint.add(String.valueOf(monster.getAttackNum()));
            monsterHint.add(String.valueOf(monster.getDefenceNum()));
            monsterHint.add(String.valueOf(monster.getBlood()));
            monsterHint.add(String.valueOf(monster.getMoney()));
            monsterHint.add(String.valueOf(monster.getExperience()));
        }

        for(String str: monsterHint){
            JLabel label = new JLabel(str);
            add(label);
            label.setVisible(true);
        }

        setVisible(true);
    }
}
