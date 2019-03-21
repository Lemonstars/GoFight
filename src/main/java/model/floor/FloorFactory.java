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
                return new Floor1();
            case 2:
                return new Floor2();
            case 3:
                return new Floor3();
            case 4:
                return new Floor4();
                default:
                    throw new IllegalArgumentException("未定义的楼层信息");
        }
    }

}
