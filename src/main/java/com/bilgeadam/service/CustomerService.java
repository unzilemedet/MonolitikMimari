package com.bilgeadam.service;

import com.bilgeadam.repository.ICustomerRepository;
import com.bilgeadam.repository.entity.Customer;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService extends ServiceManager <Customer,Long>{
    private final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository){
        super(customerRepository);
        this.customerRepository =customerRepository;
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
