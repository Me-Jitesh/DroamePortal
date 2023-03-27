package com.droame.droameportal.repositories;

import com.droame.droameportal.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location, Integer> {
}
