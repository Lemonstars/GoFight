package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class RedGemstoneThing implements IThing {

    @Override
    public String getPicName() {
        return "gemstone-red.png";
    }

    @Override
    public String getDescription() {
        return "red gemstone";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.GEMSTONE_RED;
    }
}
