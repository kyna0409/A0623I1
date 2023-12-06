package _16_IO_TextFile.exercise._e2_readfile1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile_Text {
    public static final String FILE_PATH = "D:\\LT\\A0623I1\\module2\\src\\_16_IO_TextFile\\exercise\\_e2_readfile1\\text.csv";
    public static List<Country> read(List<Country> list) throws IOException {
        Country country;
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        String []temp;
        while ((line= buff.readLine())!=null)
        {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String code = temp[1];
            String name = temp[2];
            country = new Country(id,code,name);
            list.add(country);
        }
        buff.close();
        return list;
    }
    public static void writer(Country country) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH,true);
        BufferedWriter  bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(country.getId()+","+country.getCode()+","+country.getName()+"\n");
            bufferedWriter.close();
            //bufferedWriter.flush();


    }
    public static void main(String[] args) throws IOException {
//        Country country = new Country(1,"AU","Australia");
//        writer(country);
        //read();
        List<Country> countryList = new ArrayList<>();
        read(countryList);
        for (Country country: countryList) {
            System.out.println(country);
        }
    }
}
