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

    private int level;
    private String floorFile;
    private IThing[][] distribution;

    public Floor(String floorFile, int level) {
        this.floorFile = floorFile;
        this.level = level;
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

    public int getLevel() {
        return level;
    }

    /**
     * 获取上楼初始的x坐标
     * @return
     */
    public abstract int getUpX();

    /**
     * 获取上楼初始的y坐标
     * @return
     */
    public abstract int getUpY();

    /**
     * 获取下楼初始的x坐标
     * @return
     */
    public abstract int getDownX();

    /**
     * 获取下楼初始的y坐标
     * @return
     */
    public abstract int getDownY();

}
