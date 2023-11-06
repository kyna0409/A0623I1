package _16_IO_TextFile.practice;

import java.io.*;

public class ReadATextFile {
    public static void main(String[] args) {
        try{
//            String content ="red,white,black,blue,purple";
//            // tạo một file có eeen hello trong ổ đĩa d
            File infile = new File("D://hello.txt");//mở file có sãn hay tạo một file mới
//            //Here true is to append the content to file
//            FileWriter fw = new FileWriter(infile,true);
//            //BufferedWriter writer give better performance
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(content);
//            //Closing BufferedWriter Stream
//            bw.close();
            FileReader reader = new FileReader(infile);//nối filereader với một file text
            BufferedReader bufferedReader = new BufferedReader(reader);// nối bufferreader với một filereader
            String line = null;
            while ((line=bufferedReader.readLine())!= null)// đọc từng dòng đến khi hết file
            {
                System.out.println(line);
            }
            reader.close();

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
