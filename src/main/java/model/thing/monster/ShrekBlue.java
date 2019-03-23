package model.thing.monster;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class ShrekBlue extends AbstractMonster {

    @Override
    void initBasicInfo() {
        this.attack = 15;
        this.defence = 15;
        this.blood = 250;
        this.money = 8;
        this.experience = 10;
    }

    @Override
    public String getPicName() {
        return "shrek-blue.png";
    }

    @Override
    public String getDescription() {
        return "shrek-blue";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SHREK_BLUE;
    }

}
