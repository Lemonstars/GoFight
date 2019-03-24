package model.thing.monster;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class ShrekBlack extends AbstractMonster {

    @Override
    void initBasicInfo() {
        this.attack = 20;
        this.defence = 20;
        this.blood = 300;
        this.money = 10;
        this.experience = 10;
    }

    @Override
    public String getPicName() {
        return "shrek-black.png";
    }

    @Override
    public String getDescription() {
        return "黑史莱克";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SHREK_BLACK;
    }

}
