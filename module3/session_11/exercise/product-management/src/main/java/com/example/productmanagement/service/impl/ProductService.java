package com.example.productmanagement.service.impl;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.IProcductRepository;
import com.example.productmanagement.repository.impl.ProductRepository;
import com.example.productmanagement.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProcductRepository repository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return repository.findByName(name);
    }


    @Override
    public void update(int id, Product product) {
        repository.update(id,product);
    }


    @Override
    public void remove(int id) {
        repository.remove(id);
    }

    @Override
    public int getLastId() {
        return repository.getLastId();
    }

    @Override
    public void sortByName() {
        repository.sortByName();
    }

    @Override
    public void sortByPrice() {
        repository.sortByPrice();
    }
}
