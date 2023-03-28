package com.droame.droameportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(generator = "cstmr_sql")
    @SequenceGenerator(name = "cstmr_sql")
    private Integer customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
}
