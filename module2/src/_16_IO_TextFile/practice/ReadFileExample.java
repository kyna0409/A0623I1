package _16_IO_TextFile.practice;

import java.io.*;

public class ReadFileExample {
    public static void readFileText(String filePath)
    {
        try{
            File file = new File(filePath);
            if(!file.exists())
            {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line =" ";
            int sum =0;
            while ((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println(sum);

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFileText("D://hello.txt");
    }
}
