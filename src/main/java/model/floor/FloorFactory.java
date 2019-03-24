package model.floor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/20
 */
public class FloorFactory {

    private static final Map<Integer, Floor> FLOOR_MAP = new HashMap<>();

    public static Floor createFloor(int floorLevel){
        // todo 享元工厂
        Floor floor = FLOOR_MAP.get(floorLevel);
        if(null == floor){
            switch (floorLevel){
                case 1:
                    floor =  new Floor1("map/floor1.txt", 1);
                    break;
                case 2:
                    floor = new Floor2("map/floor2.txt", 2);
                    break;
                case 3:
                    floor = new Floor3("map/floor3.txt", 3);
                    break;
                case 4:
                    floor = new Floor4("map/floor4.txt", 4);
                    break;
                default:
                    throw new IllegalArgumentException("未定义的楼层信息");
            }

            FLOOR_MAP.put(floorLevel, floor);
        }
        return floor;
    }

}
