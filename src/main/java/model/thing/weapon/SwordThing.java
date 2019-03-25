package model.thing.weapon;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public class SwordThing implements IWeapon{

    @Override
    public String getPicName() {
        return "sword.png";
    }

    @Override
    public String getDescription() {
        return "sword";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SWORD;
    }
}
