package model.monster;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class Corpse implements IMonster{

    @Override
    public String getPicName() {
        return "corpse.png";
    }

    @Override
    public String getDescription() {
        return "corpse";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.CORPSE;
    }

    @Override
    public int getAttackNum() {
        return 30;
    }

    @Override
    public int getDefenceNum() {
        return 30;
    }

    @Override
    public int getBlood() {
        return 400;
    }

    @Override
    public int getExperience() {
        return 15;
    }

    @Override
    public int getMoney() {
        return 15;
    }
}
