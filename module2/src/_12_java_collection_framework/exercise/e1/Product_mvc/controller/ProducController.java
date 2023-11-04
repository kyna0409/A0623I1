package _12_java_collection_framework.exercise.e1.Product_mvc.controller;

import _12_java_collection_framework.exercise.e1.Product_mvc.model.Product;
import _12_java_collection_framework.exercise.e1.Product_mvc.service.ProductService;
import _12_java_collection_framework.exercise.e1.Product_mvc.service.ProductServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class ProducController {
    public static void menu()
    {
        System.out.println("1.create");
        System.out.println("2.update");
        System.out.println("3.delete");
        System.out.println("4.sort");
        System.out.println("5.search by name");
        System.out.println("6.display");
        System.out.println("7.exit");
        System.out.println("Enter a choose : ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService service = new ProductServiceImpl();
        int choose =0;
        do {
            menu();
            choose=scanner.nextInt();
            switch (choose){
                case 1:
                    Product product = new Product();
                    product.setId(service.id());
                    scanner.nextLine();
                    System.out.println("Name: ");
                    product.setName(scanner.nextLine());
                    System.out.println("Price: ");
                    product.setPrice(scanner.nextInt());
                    System.out.println("Amount: ");
                    product.setAmount(scanner.nextInt());
                    service.create(product);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("nhap id: ");
                    String id = scanner.nextLine();
                    System.out.println(service.getProductById(id));
                    int select=0;
                    Map<String, Object> map = new HashMap<>();
                    do {
                        System.out.println("1.sua name");
                        System.out.println("2.sua price");
                        System.out.println("3.sua amount");
                        System.out.println("4.thoat khong muon sua");
                        System.out.println("nhap select: ");
                        select=scanner.nextInt();
                        switch (select)
                        {
                            case 1:
                                scanner.nextLine();
                                map.put("name",scanner.nextLine());
                                service.update(id,map);
                                break;
                            case 2:
                                scanner.nextLine();
                                map.put("price",scanner.nextLine());
                                service.update(id,map);
                                break;
                            case 3:
                                scanner.nextLine();
                                map.put("amount",scanner.nextLine());
                                service.update(id,map);
                                break;
                            case 4:
                                break;
                        }

                    }while (select!=4);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("id can xoa:");
                     id = scanner.nextLine();
                    service.delete(id);
                    break;
                case 4:
                    service.sort();
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("ten san pham can tim :");
                    String name = scanner.nextLine();
                    System.out.println(service.searchByName(name)!=null?service.searchByName(name):"khong tim thay");
                    break;
                case 6:
                    System.out.println("DISPLAY");
                    System.out.println(service.display());
                    break;
                case 7:
                    System.exit(0);
            }
        }while (true);
    }
}
