package model.floor;

import constant.MapConstant;
import model.thing.IThing;
import model.thing.ThingFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class FloorDataLoader {

    public static IThing[][] loadFloorData(String floorFileName){
        IThing[][] floor = new IThing[MapConstant.ROW][MapConstant.COL];
        for(int i=0; i<MapConstant.ROW; i++){
            for(int j=0; j<MapConstant.COL; j++){
                floor[i][j] = ThingFactory.create(0);
            }
        }

        ClassLoader classLoader = FloorDataLoader.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(floorFileName);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        try {
            while ((line = reader.readLine()) != null){
                String[] lineStr = line.split("\\s+");
                int x = Integer.valueOf(lineStr[0]);
                int y = Integer.valueOf(lineStr[1]);
                int type = Integer.valueOf(lineStr[2]);
                floor[x][y] = ThingFactory.create(type);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return floor;
    }

}
