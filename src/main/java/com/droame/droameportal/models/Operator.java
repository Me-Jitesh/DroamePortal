package com.droame.droameportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Operator {
    @Id
    Integer Id;
}
