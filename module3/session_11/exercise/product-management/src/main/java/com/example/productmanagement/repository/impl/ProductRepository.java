package com.example.productmanagement.repository.impl;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.IProcductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProcductRepository {
    private static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"cacao",2323434,"thơm, có màu nâu","thái nguyên"));
        products.add(new Product(2,"milk",1232445434,"thơm, có màu trắng, từ bò sữa","ba vì"));
        products.add(new Product(3,"strawberry",232443434,"thơm, có màu đỏ, tươi","đà lạt"));
        products.add(new Product(4,"avocado",5656764,"thơm, có màu xanh, béo ngậy","đăk lăk"));
        products.add(new Product(5,"durian",342323434,"thơm, có màu vàng, đậm mùi, béo","tây nguyên"));
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id)
            {
                return  products.get(i);
            }
        }
        return  null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product product:products) {
            if(product.getName().contains(name))
            {
                productList.add(product);
            }
        }
        return productList;
    }



    @Override
    public void update(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id)
            {
                products.set(i,product);
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id)
            {
                products.remove(i);
            }
        }
    }

    @Override
    public int getLastId() {
        return products.get(products.size()-1).getId();
    }

    @Override
    public void sortByName() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public static void main(String[] args) {
        IProcductRepository repository = new ProductRepository();
        repository.sortByName();
        System.out.println(repository.findAll());
    }

    @Override
    public void sortByPrice() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice()- o2.getPrice());
            }
        });
    }
}
