package model.floor;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/20
 */
public class SecondFoor implements Floor {

    @Override
    public ThingType[][] getFloorDistribution() {
        FloorDataLoader floorDataLoader = new FloorDataLoader();
        return floorDataLoader.loadFloorData("map/second-floor.txt");
    }
}
