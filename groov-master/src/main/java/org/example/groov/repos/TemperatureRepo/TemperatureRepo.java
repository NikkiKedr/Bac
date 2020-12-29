package org.example.groov.repos.TemperatureRepo;

import org.example.groov.domain.Temperature.Temperature;
import org.springframework.data.repository.CrudRepository;

public interface TemperatureRepo  extends CrudRepository<Temperature,Long> {
}
