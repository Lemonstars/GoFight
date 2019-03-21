package model.floor;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/20
 */
public class Floor3 implements Floor{

    @Override
    public ThingType[][] getFloorDistribution() {
        return FloorDataLoader.loadFloorData("map/floor3.txt");
    }
}
