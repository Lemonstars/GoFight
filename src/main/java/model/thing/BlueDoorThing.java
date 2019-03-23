package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class BlueDoorThing implements IThing{

    @Override
    public String getPicName() {
        return "door-blue.png";
    }

    @Override
    public String getDescription() {
        return "blue door";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.DOOR_BLUE;
    }
}
