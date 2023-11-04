package _12_java_collection_framework.exercise.e1.Product_mvc.service;

import _12_java_collection_framework.exercise.e1.Product_mvc.model.Product;
import _12_java_collection_framework.exercise.e1.Product_mvc.repository.ProductRepository;
import _12_java_collection_framework.exercise.e1.Product_mvc.repository.ProductRepositoryImpl;

import java.util.ArrayList;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    ProductRepository repository = new ProductRepositoryImpl();
    @Override
    public Product getProductById(String id) {
        return repository.getProductById(id);
    }

    @Override
    public void create(Product product) {
        repository.create(product);
    }

    @Override
    public void update(String id, Map<String, Object> productMap) {
        repository.update(id,productMap);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }

    @Override
    public void sort() {
        repository.sort();
    }

    @Override
    public Product searchByName(String name) {
        return repository.searchByName(name);
    }

    @Override
    public ArrayList<Product> display() {
        return repository.display();
    }

    @Override
    public String id() {
        return repository.id();
    }
}
