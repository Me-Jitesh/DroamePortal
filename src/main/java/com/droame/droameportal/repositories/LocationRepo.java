package com.droame.droameportal.repositories;

import com.droame.droameportal.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepo extends JpaRepository<Location, Integer> {
    @Query("SELECT addrId,addrLine from  Location")
    List<Object[]> getLocationIdAndAddrLine();
}
