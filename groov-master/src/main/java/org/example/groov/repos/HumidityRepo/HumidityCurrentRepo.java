package org.example.groov.repos.HumidityRepo;

import org.example.groov.domain.Humidity.HumidityCurrent;
import org.springframework.data.repository.CrudRepository;

public interface HumidityCurrentRepo extends CrudRepository<HumidityCurrent,Long> {
}
