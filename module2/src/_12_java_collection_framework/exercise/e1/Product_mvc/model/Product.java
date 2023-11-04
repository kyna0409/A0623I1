package _12_java_collection_framework.exercise.e1.Product_mvc.model;


import java.util.Comparator;

import static java.lang.Integer.compare;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private int price;
    private int amount;

    public Product() {

    }

    public Product(String id, String name, int price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    public int total()
    {
        return this.price*this.amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id1) {
        int id2 = Integer.parseInt(id1)+1;
        this.id = String.valueOf(id2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", total=" + total()+
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return this.getPrice()-o.getPrice();
    }
}
