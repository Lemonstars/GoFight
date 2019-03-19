package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class FirstFloor implements Floor{

    @Override
    public int[][] getFloorDistribution() {
        FloorDataLoader floorDataLoader = new FloorDataLoader();
        return floorDataLoader.loadFloorData("map/first-floor.txt");
    }
}
