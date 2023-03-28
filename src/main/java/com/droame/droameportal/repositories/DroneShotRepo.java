package com.droame.droameportal.repositories;

import com.droame.droameportal.models.DroneShot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DroneShotRepo extends JpaRepository<DroneShot, Integer> {
    @Query("SELECT shotId,droneShotName from  DroneShot ")
    List<Object[]> getShortIdAndName();
}
