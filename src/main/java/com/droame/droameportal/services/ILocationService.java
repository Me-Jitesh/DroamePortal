package com.droame.droameportal.services;

import com.droame.droameportal.models.Location;

import java.util.List;

public interface ILocationService {

    Integer saveLoc(Location location);

    Location getLoc(Integer locId);

    List<Location> getAllLoc();
}
