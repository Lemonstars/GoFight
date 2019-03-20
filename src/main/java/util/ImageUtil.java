package util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/20
 */
public class ImageUtil {

    public static Image getImage(String fileUrl){
        ClassLoader loader = ImageUtil.class.getClassLoader();
        Image image = null;
        try {
            image = ImageIO.read(loader.getResource(fileUrl));
        }catch (IOException e){
            e.printStackTrace();
        }

        return image;
    }

}
