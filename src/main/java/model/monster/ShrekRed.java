package model.monster;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class ShrekRed implements IMonster{

    @Override
    public String getPicName() {
        return "shrek-red.png";
    }

    @Override
    public String getDescription() {
        return "shrek red";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SHREK_RED;
    }

    @Override
    public int getAttackNum() {
        return 15;
    }

    @Override
    public int getDefenceNum() {
        return 15;
    }

    @Override
    public int getBlood() {
        return 200;
    }

    @Override
    public int getExperience() {
        return 5;
    }

    @Override
    public int getMoney() {
        return 8;
    }
}
