package model.thing.monster;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class ShrekRed extends AbstractMonster {

    @Override
    void initBasicInfo() {
        this.attack = 15;
        this.defence = 15;
        this.blood = 200;
        this.money = 5;
        this.experience = 8;
    }

    @Override
    public String getPicName() {
        return "shrek-red.png";
    }

    @Override
    public String getDescription() {
        return "shrek  red";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SHREK_RED;
    }

}
