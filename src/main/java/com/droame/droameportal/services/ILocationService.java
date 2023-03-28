package com.droame.droameportal.services;

import com.droame.droameportal.models.Location;

import java.util.List;
import java.util.Map;

public interface ILocationService {

    Integer saveLoc(Location location);

    Location getLoc(Integer locId);

    List<Location> getAllLoc();

    Map<Integer, String> getLocationIdAndAddrLine();
}
