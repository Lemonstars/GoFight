package model.monster;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class ShrekBlack implements IMonster{

    @Override
    public String getPicName() {
        return "shrek-black.png";
    }

    @Override
    public String getDescription() {
        return "shrek-black";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SHREK_BLACK;
    }

    @Override
    public int getAttackNum() {
        return 20;
    }

    @Override
    public int getDefenceNum() {
        return 20;
    }

    @Override
    public int getBlood() {
        return 300;
    }

    @Override
    public int getExperience() {
        return 10;
    }

    @Override
    public int getMoney() {
        return 10;
    }
}
