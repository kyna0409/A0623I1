package bt.util.file;

import java.io.*;
import java.util.List;

public class Writer<E>{
    public static final String FILE_PATHA= "D:\\LT\\A0623I1\\module2\\src\\bt\\data\\authenic.csv";
    public static final String FILE_PATHH= "D:\\LT\\A0623I1\\module2\\src\\bt\\data\\handgoods.csv";
    public void write(String path, List<E> list) throws IOException {
        FileWriter fw = null;
        BufferedWriter buffer = null;
        try {
            fw = new FileWriter(path);
            buffer = new BufferedWriter(fw);
            for(E e:list)
            {
                buffer.write(e.toString()+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            buffer.flush();
            buffer.close();
        }


    }

}
