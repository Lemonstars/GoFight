package model.floor;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public abstract class Floor {

    private String floorFile;
    private ThingType[][] distribution;

    public Floor(String floorFile) {
        this.floorFile = floorFile;
        getFloorDistribution();
    }

    public ThingType[][] getFloorDistribution() {
        if(null == distribution){
            distribution = FloorDataLoader.loadFloorData(floorFile);
        }

        return distribution;
    }

    public void locateThing(int x, int y, ThingType thingType){
        distribution[x][y] = thingType;
    }

    /**
     * 获取起始点的x坐标
     * @return
     */
    public abstract int getStartX();

    /**
     * 获取起始点的y坐标
     * @return
     */
    public abstract int getStartY();


}
