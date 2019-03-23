package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class BlueGemstoneThing implements IThing{

    @Override
    public String getPicName() {
        return "gemstone-blue.png";
    }

    @Override
    public String getDescription() {
        return "blue gemstone";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.GEMSTONE_BLUE;
    }
}
