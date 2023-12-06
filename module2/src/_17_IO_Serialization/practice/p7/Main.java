package _17_IO_Serialization.practice.p7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
//        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
//        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
//        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
//        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
//        write(students);
        List<Student> studentList = read();
        for (Student student:studentList)
        {
            System.out.println(student);
        }
    }
    public static void write(List<Student>studentList) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\LT\\A0623I1\\module2\\src\\_17_IO_Serialization\\practice\\p7\\student.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentList);
        oos.flush();
        oos.close();
    }
    public static List<Student> read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\LT\\A0623I1\\module2\\src\\_17_IO_Serialization\\practice\\p7\\student.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> studentList = (List<Student>) ois.readObject();
        ois.close();
        return studentList;
    }

}
