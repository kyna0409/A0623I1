package _17_IO_Serialization.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class p4 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:\\LT\\A0623I1\\module2\\src\\_17_IO_Serialization\\practice\\hello.txt");
        // Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
// Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
        byte[] bytes = new byte[] { 'C', 'o', 'd', 'e', 'e', 'y', 'm' };

        // Ghi lần lượt các ký tự vào luồng
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            // Ghi ký tự vào luồng
            os.write(b);
        }
        // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất.
        os.close();
    }
}
