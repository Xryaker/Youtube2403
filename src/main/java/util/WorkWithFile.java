package util;

import data.VideoObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WorkWithFile {
    public static void writeFile(List<VideoObject> list, String fileName) throws IOException {
        BufferedWriter out=new BufferedWriter(new FileWriter(fileName+".txt"));
        for(VideoObject l:list){
            out.write(l+"\n");
        }
        out.flush();
        out.close();
    }
}
