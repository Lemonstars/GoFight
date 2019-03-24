package util;

import constant.PicConstant;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/20
 */
public class ImageIconUtil {

    private static final Map<String, ImageIcon> IMAGE_MAP = new HashMap<>(32);

    public static ImageIcon create(int width, int height, String picName){
        ImageIcon imageIcon = IMAGE_MAP.get(picName);
        if(imageIcon == null){
            try {
                Image image = ImageIO.read(ImageIconUtil.class.getResource(PicConstant.PATH_PREFIX + picName));
                imageIcon = new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_DEFAULT));
            }catch (IOException e){
                e.printStackTrace();
            }
            IMAGE_MAP.put(picName, imageIcon);
        }

        return imageIcon;
    }

}
