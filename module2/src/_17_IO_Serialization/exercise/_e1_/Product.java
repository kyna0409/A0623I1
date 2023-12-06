package _17_IO_Serialization.exercise._e1_;

import java.io.Serializable;

public class Product implements Serializable,Comparable<Product> {
    private static final long serialVersionUID = 10L;
    private String code ;
    private String name ;
    private String brand ;
    private double price ;
    private String description;

    public Product() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public Product(String code, String name, String brand, double price, String description) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }


    @Override
    public int compareTo(Product o) {
        return this.getPrice()>o.getPrice()?1:-1;
    }
}
