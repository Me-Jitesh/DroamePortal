package com.droame.droameportal.services;

import com.droame.droameportal.models.Booking;
import com.droame.droameportal.models.Customer;

import java.util.List;

public interface ICustomerService {

    Integer saveCustomer(Customer customer);

    Customer getCustomer(Integer customerId);

    List<Customer> getAllCustomer();
}
