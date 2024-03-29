package service.impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService{
    private ICustomerRepository repository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

}
