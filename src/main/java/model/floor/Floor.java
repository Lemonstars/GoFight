package model.floor;

import constant.MapConstant;
import model.thing.IThing;
import model.thing.ThingFactory;
import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public abstract class Floor {

    private String floorFile;
    private IThing[][] distribution;

    public Floor(String floorFile) {
        this.floorFile = floorFile;
        getFloorDistribution();
    }

    public IThing[][] getFloorDistribution() {
        if(null == distribution){
            distribution = FloorDataLoader.loadFloorData(floorFile);
        }

        return distribution;
    }

    public boolean isValidLocation(int x, int y){
        return (x >= 0 && x < MapConstant.ROW) &&
                (y >= 0 && y < MapConstant.COL);
    }

    public void locateThing(int x, int y, ThingType thingType){
        distribution[x][y] = ThingFactory.create(thingType);
    }

    public IThing getThingType(int x, int y){
        return distribution[x][y];
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
