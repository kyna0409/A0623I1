package _12_java_collection_framework.exercise.e1.Product_mvc.repository;

import _12_java_collection_framework.exercise.e1.Product_mvc.model.Product;

import java.util.ArrayList;
import java.util.Map;

public interface ProductRepository {
    Product getProductById(String id);
    void create(Product product);
    void update(String id, Map<String,Object>productMap);
    void delete(String id);
    void sort();
    Product searchByName(String name);
    ArrayList<Product> display();
    String id();
}
