package _17_IO_Serialization.exercise._e1_;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductService {
    private static final String FILE_PATH ="D:\\LT\\A0623I1\\module2\\src\\_17_IO_Serialization\\exercise\\_e1_\\meo.dat";
    private static List<Product> list = new ArrayList<>();
    static {
        list.add(new Product("1","coca","coca",1233,"nhieu duong"));
        list.add(new Product("2","cam","cam",1234,"it duong"));
    }
    public void display()
    {
        for (Product product:list)
        {
            System.out.println(product);
        }
    }
    public ProductService() {
        try {
            write(list);
            list = read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void add(Product product) throws IOException {
        list.add(product);
        write(list);
    }
    public Product search(String name)
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name))
            {
                return list.get(i);
            }
        }
        return null;
    }
    public void sort()
    {
        Collections.sort(list);
    }
    public void delete(String code) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getCode().equals(code))
            {
                list.remove(i);
            }
        }
        write(list);
    }

    public void write(List<Product>ProductList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ProductList);
        oos.flush();
        oos.close();
    }
    public  List<Product> read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Product> ProductList = (List<Product>) ois.readObject();
        ois.close();
        return ProductList;
    }
}
