package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class TileThing implements IThing{

    @Override
    public String getPicName() {
        return "tile.png";
    }

    @Override
    public String getDescription() {
        return "tile";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.TILE;
    }
}
