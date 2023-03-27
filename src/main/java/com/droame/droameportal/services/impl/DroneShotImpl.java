package com.droame.droameportal.services.impl;

import com.droame.droameportal.models.DroneShot;
import com.droame.droameportal.repositories.DroneShotRepo;
import com.droame.droameportal.services.IDroneShotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneShotImpl implements IDroneShotService {

    @Autowired
    private DroneShotRepo repo;

    @Override
    public Integer saveDroneShot(DroneShot droneShot) {
        return repo.save(droneShot).getShotId();
    }

    @Override
    public DroneShot getShot(Integer shotId) {
        return repo.findById(shotId).get();
    }

    @Override
    public List<DroneShot> getAllShot() {
        return repo.findAll();
    }
}
