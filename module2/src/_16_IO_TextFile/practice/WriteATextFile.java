package _16_IO_TextFile.practice;

import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteATextFile {
    public static void main(String[] args) {
        //các file io đều có thể gây ra ngoại lệ
        try{
            // mở file để ghi
            FileWriter writer = new FileWriter("hello.txt");
            writer.write("hello!");// write() ghi một đối tượng String ra file
            writer.close();// đóng file khi xong việc
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
