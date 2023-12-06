package _17_IO_Serialization.exercise._e2_;

import _17_IO_Serialization.practice.p5.Product;

import java.io.*;

public class Main {
    private static final String PATH_SOURCE="D:\\LT\\A0623I1\\module2\\src\\_17_IO_Serialization\\exercise\\_e2_\\source.dat";
    private static final String PATH_TARGET="D:\\LT\\A0623I1\\module2\\src\\_17_IO_Serialization\\exercise\\_e2_\\target.dat";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH_SOURCE);
        FileOutputStream fos = new FileOutputStream(PATH_TARGET);
        byte [] bytes = new byte[1024];
        int length =0;
        while ((length= fis.read(bytes))>0)
        {
            fos.write(bytes,0,length);
        }
        fis.close();
        fos.close();

    }
}
