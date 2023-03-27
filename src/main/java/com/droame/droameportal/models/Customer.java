package com.droame.droameportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Integer customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
}
