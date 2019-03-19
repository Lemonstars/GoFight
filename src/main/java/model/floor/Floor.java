package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public interface Floor {

    /**
     * 获取楼层的物品分布信息
     * @return
     */
    int[][] getFloorDistribution();

}
