package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class YellowDoorThing implements IThing{

    @Override
    public String getPicName() {
        return "door-yellow.png";
    }

    @Override
    public String getDescription() {
        return "yellow door";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.DOOR_YELLOW;
    }
}
