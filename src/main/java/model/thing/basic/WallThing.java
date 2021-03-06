package model.thing.basic;

import model.thing.IThing;
import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class WallThing implements IThing {

    @Override
    public String getPicName() {
        return "wall.png";
    }

    @Override
    public String getDescription() {
        return "wall";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.WALL;
    }
}
