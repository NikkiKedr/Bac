package org.example.groov.repos.HumidityRepo;

import org.example.groov.domain.Humidity.Humidity;
import org.springframework.data.repository.CrudRepository;

public interface HumidityRepo extends CrudRepository<Humidity,Long> {
}
