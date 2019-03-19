package model.floor;

import constant.MapConstant;

import java.io.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class FloorDataLoader {

    public int[][] loadFloorData(String floorFileName){
        int[][] floor = new int[MapConstant.ROW][MapConstant.COL];
        for(int i=0; i<MapConstant.ROW; i++){
            for(int j=0; j<MapConstant.COL; j++){
                floor[i][j] = -1;
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
                floor[x][y] = type;
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return floor;
    }

}
