package _17_IO_Serialization.practice;

import java.io.IOException;
import java.io.InputStream;

public class p1 {
    public static void main(String[] args) throws IOException {
        InputStream  is = System.in;
        while (true)
        {
            System.out.println("nhap ki tu tu ban phim : ");
            int ch = is.read();
            if(ch=='q')
            {
                System.out.println("finish!!!");
                break;
            }
            is.skip(2);
            System.out.println("in ra cac ki tu nhap tu ban phim : "+(char)ch);
        }
    }
}
