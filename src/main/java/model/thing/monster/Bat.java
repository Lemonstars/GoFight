package model.thing.monster;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class Bat extends AbstractMonster {

    @Override
    void initBasicInfo() {
        this.attack = 10;
        this.defence = 10;
        this.blood = 100;
        this.money = 3;
        this.experience = 2;
    }

    @Override
    public String getPicName() {
        return "bat.png";
    }

    @Override
    public String getDescription() {
        return "bat";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.BAT;
    }

}
