package _16_IO_TextFile.exercise._e1_copyfile;

import java.io.*;

public class CopyFile {
    public static String path = "src\\_16_IO_TextFile\\exercise\\_e1_copyfile";
    public static void copyfile(String source,String target) throws IOException {

        FileInputStream sourceFile = new FileInputStream(source);
        FileOutputStream targettFile = new FileOutputStream(target);
        byte[] array = new byte[1024];
        sourceFile.read(array);
        targettFile.write(array);
        sourceFile.close();
        targettFile.close();


    }
    public static void main(String[] args) {
        String so= path+ "\\text.txt";
        String ta= path+ "\\textcopy.txt";
        try {
            copyfile(so,ta);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
