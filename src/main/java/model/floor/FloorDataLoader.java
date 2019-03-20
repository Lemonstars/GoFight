package model.floor;

import constant.MapConstant;
import model.thing.ThingPic;
import model.thing.ThingType;

import java.io.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class FloorDataLoader {

    public ThingType[][] loadFloorData(String floorFileName){
        ThingType[][] floor = new ThingType[MapConstant.ROW][MapConstant.COL];
        for(int i=0; i<MapConstant.ROW; i++){
            for(int j=0; j<MapConstant.COL; j++){
                floor[i][j] = ThingType.TILE;
            }
        }

        Class clazz = getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(floorFileName);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        try {
            while ((line = reader.readLine()) != null){
                String[] lineStr = line.split("\\s+");
                int x = Integer.valueOf(lineStr[0]);
                int y = Integer.valueOf(lineStr[1]);
                int type = Integer.valueOf(lineStr[2]);
                ThingType thingType = ThingPic.convertIdx2Type(type);
                floor[x][y] = thingType;
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return floor;
    }

}
