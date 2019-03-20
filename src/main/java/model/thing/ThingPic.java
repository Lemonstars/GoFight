package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class ThingPic {

    private static String[] picName = {"tile.png", "wall.png", "door-yellow.png",
            "door-blue.png", "door-red.png", "step-up.png", "step-down.png"};

    private static ThingType[] thingType = {ThingType.TILE, ThingType.WALL, ThingType.DOOR_YELLOW,
    ThingType.DOOR_BLUE, ThingType.DOOR_RED, ThingType.STEP_UP, ThingType.STEP_DOWN};

    public static String convertType2PicName(ThingType type){
        for(int i=0; i<thingType.length; i++){
            if(type == thingType[i]){
                return picName[i];
            }
        }

        throw new IllegalArgumentException("未知物件类型");
    }

    public static ThingType convertIdx2Type(int idx){
        if(idx < 0 || idx >= thingType.length){
            throw new IllegalArgumentException("物件下标错误");
        }

        return thingType[idx];
    }


}
