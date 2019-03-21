package model.floor;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class Floor1 implements Floor{

    @Override
    public ThingType[][] getFloorDistribution() {
        return FloorDataLoader.loadFloorData("map/floor1.txt");
    }
}
