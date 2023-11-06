package _16_IO_TextFile.practice;

import java.io.File;

public class Filetxt {
    public static void main(String[] args) {
        File file = new File("D://BOOKs");//tạo một thư mục mới
        file.mkdir();
        // liệt kê nội dung của một thư mục
//        if(file.isDirectory())
//        {
//            String [] fileContents = file.list();
//            for (int i = 0; i < fileContents; i++) {
//                System.out.println(fileContents);
//            }
//        }
        // lấy đường dẫn tuyệt đối của file hoặc thư mục
        System.out.println(file.getAbsolutePath());
        //Xóa file hoặc thư mục (trả về true nếu thành công)
        boolean isDeleted = file.delete();
    }
}
