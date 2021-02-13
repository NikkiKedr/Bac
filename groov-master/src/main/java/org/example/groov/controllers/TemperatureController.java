package org.example.groov.controllers;

import org.example.groov.domain.Temperature.Temperature;
import org.example.groov.domain.Temperature.TemperatureCurrent;
import org.example.groov.repos.TemperatureRepo.TemperatureCurrentRepo;
import org.example.groov.repos.TemperatureRepo.TemperatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class TemperatureController {

    @Autowired
    private TemperatureRepo temperatureRepo;
    @Autowired
    private TemperatureCurrentRepo temperatureCurrentRepo;

    @GetMapping("/addTemp")
    public String addTemp(@RequestParam String temp, Map<String, Object> model){
        Date date = new Date();
        Temperature temperature = new Temperature(temp,date);
        temperatureRepo.save(temperature);

        TemperatureCurrent temperatureCurrent = new TemperatureCurrent(temp,date);
        temperatureCurrentRepo.deleteAll();
        temperatureCurrentRepo.save(temperatureCurrent);
        Iterable<Temperature> temperatures = temperatureRepo.findAll();
        model.put("temperatures",temperatures);
        return "main";
    }
}
