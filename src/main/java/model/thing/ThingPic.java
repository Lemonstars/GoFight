package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class ThingPic {

    private static String[] picName = {"wall.png", "door.png", "door-yellow.png",
            "door-blue.png", "door-red.png", "step-up.png", "step-down.png", "tile.png"};

    public static String getPicName(int typeNum){
        if(typeNum < 0 || typeNum >= picName.length){
            throw new IllegalArgumentException("访问图片下标异常");
        }
        return picName[typeNum];
    }

}
