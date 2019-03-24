package model.thing.monster;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class Skeleton extends AbstractMonster {

    @Override
    void initBasicInfo() {
        this.attack = 15;
        this.defence = 12;
        this.blood = 150;
        this.money = 3;
        this.experience = 5;
    }

    @Override
    public String getPicName() {
        return "skeleton.png";
    }

    @Override
    public String getDescription() {
        return "骷髅";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SKELETON;
    }

}
