package com.droame.droameportal.services.impl;

import com.droame.droameportal.models.Location;
import com.droame.droameportal.repositories.LocationRepo;
import com.droame.droameportal.services.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationImpl implements ILocationService {

    @Autowired
    private LocationRepo repo;

    @Override
    public Integer saveLoc(Location location) {
        return repo.save(location).getAddrId();
    }

    @Override
    public Location getLoc(Integer locId) {
        return repo.findById(locId).get();
    }

    @Override
    public List<Location> getAllLoc() {
        return repo.findAll();
    }
}
