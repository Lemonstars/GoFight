package model.floor;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class FirstFloor implements Floor{

    @Override
    public ThingType[][] getFloorDistribution() {
        FloorDataLoader floorDataLoader = new FloorDataLoader();
        return floorDataLoader.loadFloorData("map/first-floor.txt");
    }
}
