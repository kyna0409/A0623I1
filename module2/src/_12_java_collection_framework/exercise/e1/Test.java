package _12_java_collection_framework.exercise.e1;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("1","coca",1000,2);
        Product product2 = new Product("2","pepsi",3000,20);
        Product product3 = new Product("3","cacao",14000,9);
        Product product4 = new Product("4","coconut",10500,4);
        Product product5 = new Product("5","orange",10300,5);
        Product product6 = new Product("6","cacao",10200,8);
        ProductManager productManager = new ProductManager();
        productManager.createProduct(product1);
        productManager.createProduct(product2);
        productManager.createProduct(product3);
        productManager.createProduct(product4);
        productManager.createProduct(product5);
        productManager.createProduct(product6);
        //productManager.deleteProduct("1");
        //productManager.sortProductAscending();
       // productManager.sortProductDescending();
        //productManager.displayProcduct();
        productManager.searchByName("cacao");
        productManager.updateProduct("2");
        productManager.displayProcduct();

    }
}
