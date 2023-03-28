package com.droame.droameportal.services;

import com.droame.droameportal.models.Booking;
import com.droame.droameportal.models.Customer;

import java.util.List;
import java.util.Map;

public interface ICustomerService {

    Integer saveCustomer(Customer customer);

    Customer getCustomer(Integer customerId);

    List<Customer> getAllCustomer();

    Map<Integer, String> getCustomerIdAndName();
}
