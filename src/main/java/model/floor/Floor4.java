package model.floor;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class Floor4 implements Floor{

    @Override
    public ThingType[][] getFloorDistribution() {
        return FloorDataLoader.loadFloorData("map/floor4.txt");
    }
}
