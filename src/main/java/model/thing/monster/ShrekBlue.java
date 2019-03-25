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
        this.attack = 12;
        this.defence = 12;
        this.blood = 100;
        this.money = 8;
        this.experience = 10;
    }

    @Override
    public String getPicName() {
        return "shrek-blue.png";
    }

    @Override
    public String getDescription() {
        return "蓝史莱克";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SHREK_BLUE;
    }

}
