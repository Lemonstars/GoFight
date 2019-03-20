package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/20
 */
public class FloorFactory {

    public Floor createFloor(int floor){
        switch (floor){
            case 1:
                return new FirstFloor();
                default:
                    throw new IllegalArgumentException("未定义的楼层信息");
        }
    }

}
