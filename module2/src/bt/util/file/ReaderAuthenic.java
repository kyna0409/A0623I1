package bt.util.file;

import bt.model.Authenic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderAuthenic {
    public List<Authenic> reader(String path) throws IOException {
        List<Authenic> authenicList = new ArrayList<>();
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(path);
            bufferedReader = new BufferedReader(reader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null)
            {
                String [] arr = line.split(",");
                String id = arr[0];
                String name = arr[1];
                double price = Double.parseDouble(arr[2]);
                String brand = arr[3];
                String Codewarranty = arr[4];
                String Timewarranty = arr[5];
                Authenic authenic = new Authenic(id, name,price,brand,Codewarranty,Timewarranty);
                authenicList.add(authenic);
            }
            return authenicList;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            bufferedReader.close();
        }


    }
}
