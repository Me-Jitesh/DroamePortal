package com.droame.droameportal.repositories;

import com.droame.droameportal.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
