package _12_java_collection_framework.exercise.e1.Product_mvc.repository;

import _12_java_collection_framework.exercise.e1.Product_mvc.model.Product;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository{
    private static List<Product>products = new ArrayList<Product>();
    static {
        products.add(new Product("1","coca",9000,3));
        products.add(new Product("2","pepsi",3000,9));
        products.add(new Product("3","orange",10000,6));
        products.add(new Product("4","blueberry",5000,4));
        products.add(new Product("5","strawberry",69000,5));
    }
    @Override
    public Product getProductById(String id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId().equals(id)){
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public void update(String id, Map<String, Object> productMap) {
        Product product = getProductById(id);
        if(productMap.get("name")!=null)
        {
            product.setName(productMap.get("name").toString());
        }
        if(productMap.get("price")!=null)
        {
            product.setPrice(Integer.parseInt(productMap.get("price").toString()));
        }
        if(productMap.get("amount")!=null)
        {
            product.setAmount(Integer.parseInt(productMap.get("amount").toString()));
        }

    }

    @Override
    public void delete(String id) {
       products.remove(getProductById(id));
    }

    @Override
    public void sort() {
        Collections.sort(products);
    }

    @Override
    public Product searchByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equals(name))
            {
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<Product> display() {
        return (ArrayList<Product>) products;
    }

    @Override
    public String id() {
       return products.get(products.size()-1).getId();
    }
}
