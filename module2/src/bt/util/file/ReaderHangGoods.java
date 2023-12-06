package bt.util.file;

import bt.model.Authenic;
import bt.model.HangGoods;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderHangGoods {
    public List<HangGoods> reader(String path) throws IOException {
        List<HangGoods> hangGoodsList = new ArrayList<>();
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
                String country = arr[4];
                String status = arr[5];
                HangGoods hangGoods = new HangGoods(id, name,price,brand,country,status);
                hangGoodsList.add(hangGoods);
            }
            return hangGoodsList;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            bufferedReader.close();
        }


    }
}
