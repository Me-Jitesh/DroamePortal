package com.droame.droameportal.services;

import com.droame.droameportal.models.DroneShot;

import java.util.List;
import java.util.Map;

public interface IDroneShotService {

    Integer saveDroneShot(DroneShot droneShot);

    DroneShot getShot(Integer shotId);

    List<DroneShot> getAllShot();

    Map<Integer, String> getShortIdAndName();
}
