package com.example.productmanagement.repository;

import com.example.productmanagement.model.Product;

import java.util.List;

public interface IProcductRepository {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    List<Product> findByName(String name);
    void update (int id, Product product);
    void remove(int id);
    int getLastId();
    void sortByName();
    void sortByPrice();

}
