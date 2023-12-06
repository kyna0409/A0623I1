package _17_IO_Serialization.practice;

import java.io.*;

public class p2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\LT\\A0623I1\\module2\\src\\_17_IO_Serialization\\practice\\hello.txt");
        int i=-1;
        while ((i=is.read())!=-1)
        {
            System.out.println((char) i);
        }
        is.close();
    }
}
