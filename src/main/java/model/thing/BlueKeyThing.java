package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class BlueKeyThing implements IThing {

    @Override
    public String getPicName() {
        return "key-blue.png";
    }

    @Override
    public String getDescription() {
        return "blue key";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.KEY_BLUE;
    }
}
