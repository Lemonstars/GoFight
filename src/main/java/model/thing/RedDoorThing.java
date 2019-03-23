package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class RedDoorThing implements IThing{

    @Override
    public String getPicName() {
        return "door-red.png";
    }

    @Override
    public String getDescription() {
        return "red door";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.DOOR_RED;
    }
}
