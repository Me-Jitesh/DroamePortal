package com.droame.droameportal.repositories;

import com.droame.droameportal.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    @Query("SELECT customerId,customerName from  Customer")
    List<Object[]> getCustomerIdAndName();
}
