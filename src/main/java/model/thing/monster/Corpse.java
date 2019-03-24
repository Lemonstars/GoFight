package model.thing.monster;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class Corpse extends AbstractMonster {

    @Override
    void initBasicInfo() {
        this.attack = 30;
        this.defence = 30;
        this.blood = 400;
        this.money = 15;
        this.experience = 15;
    }

    @Override
    public String getPicName() {
        return "corpse.png";
    }

    @Override
    public String getDescription() {
        return "僵尸";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.CORPSE;
    }

}
