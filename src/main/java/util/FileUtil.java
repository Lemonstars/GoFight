package util;

import java.io.*;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public class FileUtil {

    public static void writeFile(String fileName, String line){
        File fout = new File(fileName);
        try(FileOutputStream fos = new FileOutputStream(fout, true);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos))){
            bw.write(line);
            bw.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
