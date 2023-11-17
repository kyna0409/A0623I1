package _16_IO_TextFile.exercise._e2_readfile;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile_Text {
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            String line = " ";
            br = new BufferedReader(new FileReader("src\\_16_IO_TextFile\\exercise\\_e2_readfile\\text.txt"));
            while ((line = br.readLine())!=null)
            {
                print(parse(line));
            }
            br.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
   public static List<String> parse(String countryLine)
   {
       List<String> list = new ArrayList<>();
       if(countryLine!=null)
       {
           String [] arr = countryLine.split(",");
           for (int i = 0; i < arr.length; i++) {
               list.add(arr[i]);
           }
       }
       return list;
   }
   public static void print(List<String> list)
   {
       System.out.println("Country [ id= "+list.get(0)+", code= "+ list.get(1)+", name= "+ list.get(2)+"]");
   }
}
