package com.droame.droameportal.services;

import com.droame.droameportal.models.DroneShot;

import java.util.List;

public interface IDroneShotService {

    Integer saveDroneShot(DroneShot droneShot);

    DroneShot getShot(Integer shotId);

    List<DroneShot> getAllShot();
}
