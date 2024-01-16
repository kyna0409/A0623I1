package repository.impl;

import model.Customer;
import repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","img1.jpg"));
        customers.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","img2.jpg"));
        customers.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","img3.jpg"));
        customers.add(new Customer("Trần Đăng Khoa ","1983-08-23","Hà Tây","img4.jpg"));
        customers.add(new Customer("Nguyễn Đình Thi","1983-08-24","Hà Nội","img5.webp"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
