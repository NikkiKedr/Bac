package org.example.groov.repos.TemperatureRepo;

import org.example.groov.domain.Temperature.TemperatureCurrent;
import org.springframework.data.repository.CrudRepository;

public interface TemperatureCurrentRepo extends CrudRepository<TemperatureCurrent,Long> {
}
