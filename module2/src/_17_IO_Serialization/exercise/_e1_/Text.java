package _17_IO_Serialization.exercise._e1_;

import java.io.IOException;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();
        int choose =0;
        do {
            System.out.println("1.add");
            System.out.println("2.update");
            System.out.println("3.delete");
            System.out.println("4.search");
            System.out.println("5.sort");
            System.out.println("6.display");
            System.out.println("7.exit");
            choose=Integer.parseInt(sc.nextLine());
            switch (choose)
            {
                case 1:
                    service.add(new Product("3","xoai","xoai",12345,"thom"));
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("nhap code : ");
                    String code = sc.nextLine();
                    service.delete(code);
                    break;
                case 4:
                    System.out.println("nhap name : ");
                    String name =sc.nextLine();
                    System.out.println(service.search(name));
                    break;
                case 5:
                    service.sort();
                    break;
                case 6:
                    service.display();
                    break;
                case 7: System.exit(0);
            }
        }while (true);
    }
}
