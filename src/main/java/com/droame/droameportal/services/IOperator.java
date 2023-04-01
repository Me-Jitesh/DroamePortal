package com.droame.droameportal.services;

import com.droame.droameportal.models.Operator;

import java.util.Optional;

public interface IOperator {
    Optional<Operator> getOperator(Integer id);
}
