package com.droame.droameportal.services.impl;

import com.droame.droameportal.models.Customer;
import com.droame.droameportal.repositories.CustomerRepo;
import com.droame.droameportal.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepo repo;

    @Override
    public Integer saveCustomer(Customer customer) {
        return repo.save(customer).getCustomerId();
    }

    @Override
    public Customer getCustomer(Integer customerId) {
        return repo.findById(customerId).get();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return repo.findAll();
    }
}
