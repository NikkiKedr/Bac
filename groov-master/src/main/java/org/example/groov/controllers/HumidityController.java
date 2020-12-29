package org.example.groov.controllers;

import org.example.groov.domain.Humidity.Humidity;
import org.example.groov.domain.Humidity.HumidityCurrent;
import org.example.groov.repos.HumidityRepo.HumidityCurrentRepo;
import org.example.groov.repos.HumidityRepo.HumidityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class HumidityController {
    @Autowired
    private HumidityRepo humidityRepo;

    @Autowired
    private HumidityCurrentRepo humidityCurrentRepo;
    @GetMapping("/addHumi")
    public String addHumi(@RequestParam String humi, Map<String, Object> model){
        Date date = new Date();
        Humidity humidity = new Humidity(humi, date);
        humidityRepo.save(humidity);
        HumidityCurrent humidityCurrent = new HumidityCurrent(humi,date);
        humidityCurrentRepo.deleteAll();
        humidityCurrentRepo.save(humidityCurrent);
        Iterable<Humidity> humidities = humidityRepo.findAll();
        model.put("humidities",humidities);
        return "main";
    }

}
