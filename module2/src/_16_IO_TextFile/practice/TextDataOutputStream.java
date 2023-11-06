package _16_IO_TextFile.practice;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextDataOutputStream {
    public static void main(String[] args) {
        int[] a ={2,3,5,7,11};
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("D://hello.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            for (int i = 0; i < a.length; i++) {
                dataOutputStream.writeInt(a[i]);//ghi du lieu kieu int
                dataOutputStream.close();
            }

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
