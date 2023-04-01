package com.droame.droameportal.services.impl;

import com.droame.droameportal.models.Operator;
import com.droame.droameportal.repositories.OperatorRepo;
import com.droame.droameportal.services.IOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OperatorImpl implements IOperator {
    @Autowired
    private OperatorRepo repo;

    @Override
    public Optional<Operator> getOperator(Integer id) {
        return repo.findById(id);
    }
}
