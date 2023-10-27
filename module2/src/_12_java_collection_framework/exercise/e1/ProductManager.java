package _12_java_collection_framework.exercise.e1;

import java.util.*;

public class ProductManager implements Comparator<Product> {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void createProduct(Product product) {
        products.add(product);
    }
    public void updateProduct(String id)
    {
        for(Product product:products)
        {
            if(product.getId().equals(id)){

                Scanner scanner = new Scanner(System.in);
                String choose=null;
               do{
                   System.out.println("choose in element if you edit it");
                   System.out.println("name: edit name");
                   System.out.println("price: edit price");
                   System.out.println("amount: edit amount");
                   choose =scanner.nextLine();
                   switch (choose)
                   {
                       case "name":
                           System.out.println("enter name if you want to edit");
                           String name = scanner.nextLine();
                           product.setName(name);
                           products.set(Integer.parseInt(id)-1,product);
                           break;
                       case "price":
                           System.out.println("enter price if you want to edit");
                           int price = scanner.nextInt();
                           product.setPrice(price);
                           products.set(Integer.parseInt(id)-1,product);
                           break;
                       case "amount":
                           System.out.println("enter amount if you want to edit");
                           int amount = scanner.nextInt();
                           product.setAmount(amount);
                           products.set(Integer.parseInt(id)-1,product);
                           break;
                       case "exit":
                           break;
                   }
               }while (!choose.equals("exit"));
            }
        }
    }

    public Product deleteProduct(String id) {
        for (int i = 0; i < products.size(); i++) {
         if(products.get(i).getId().equals(id)){
             return products.remove(i);
         }
        }
        return null;
    }
    public void sortProductAscending(){
        Collections.sort(products);
    }
    public  void sortProductDescending()
    {
        Collections.sort(products,reversed());
    }
    public void displayProcduct()
    {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\tDISPLAY PRODUCT \t\t\t\t\t\t\t\t\t|");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|\t\tID\t\t|\t\tNAME\t\t|\t\tAMOUNT\t\t|\t\tPRICE\t\t|\t\tTOTAL\t\t|");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (Product product: products) {
            System.out.println("|\t\t"+product.getId()+"\t\t|"+"\t\t"+product.getName()+"\t\t|"+"\t\t"+product.getAmount()+"\t\t\t|"+"\t\t"+product.getPrice()+"\t\t|"+"\t\t"+product.total()+"\t\t|");
            System.out.println("-------------------------------------------------------------------------------------------------");
        }
    }
    public void searchByName(String name)
    {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\tDISPLAY PRODUCT \t\t\t\t\t\t\t\t\t|");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|\t\tID\t\t|\t\tNAME\t\t|\t\tAMOUNT\t\t|\t\tPRICE\t\t|\t\tTOTAL\t\t|");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for(Product product:products)
        {
            if(product.getName().equals(name)){
                System.out.println("|\t\t"+product.getId()+"\t\t|"+"\t\t"+product.getName()+"\t\t|"+"\t\t"+product.getAmount()+"\t\t\t|"+"\t\t"+product.getPrice()+"\t\t|"+"\t\t"+product.total()+"\t\t|");
                System.out.println("-------------------------------------------------------------------------------------------------");
            }
        }

    }


    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
