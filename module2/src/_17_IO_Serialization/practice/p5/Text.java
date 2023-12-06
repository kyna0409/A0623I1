package _17_IO_Serialization.practice.p5;

import java.io.*;

public class Text {
    public static void writeObject(Product product) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\LT\\A0623I1\\module2\\src\\_17_IO_Serialization\\practice\\p5\\text.dat",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(product);
        oos.flush();
        oos.close();
    }
    public static Product readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\LT\\A0623I1\\module2\\src\\_17_IO_Serialization\\practice\\p5\\text.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Product product = (Product) ois.readObject();
        ois.close();
        return product;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Product product = new Product(1,"coca",1213,"nuoc ngot co ga");
//        Product product1 = new Product(2,"cacao",1213,"nuoc ngot co ga");
//        writeObject(product);
//        writeObject(product1);
       Product product = readObject();
        System.out.println(product);

    }
}
