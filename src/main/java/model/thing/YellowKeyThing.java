package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class YellowKeyThing implements IThing {

    @Override
    public String getPicName() {
        return "key-yellow.png";
    }

    @Override
    public String getDescription() {
        return "yellow key";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.KEY_YELLOW;
    }
}
