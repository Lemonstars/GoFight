package util;

import java.awt.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public class LocationUtil {

    public static int computeLocationX(int width){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        return (screenWidth - width) / 2;
    }

    public static int computeLocationY(int height){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = (int) screenSize.getHeight();
        return (screenHeight - height) / 2;
    }

}
