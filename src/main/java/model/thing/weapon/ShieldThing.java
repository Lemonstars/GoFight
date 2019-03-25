package model.thing.weapon;

import model.thing.IThing;
import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public class ShieldThing implements IThing{

    @Override
    public String getPicName() {
        return "shield.png";
    }

    @Override
    public String getDescription() {
        return "shield";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SHIELD;
    }
}
