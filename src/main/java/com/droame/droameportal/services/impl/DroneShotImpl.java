package com.droame.droameportal.services.impl;

import com.droame.droameportal.models.DroneShot;
import com.droame.droameportal.repositories.DroneShotRepo;
import com.droame.droameportal.services.IDroneShotService;
import com.droame.droameportal.utils.MyAppUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public Map<Integer, String> getShortIdAndName() {
        List<Object[]> list = repo.getShortIdAndName();
        return MyAppUtility.convertListIntoMap(list);
    }
}
