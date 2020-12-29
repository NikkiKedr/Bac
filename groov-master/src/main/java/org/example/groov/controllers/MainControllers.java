package org.example.groov.controllers;

import org.example.groov.domain.Humidity.Humidity;
import org.example.groov.domain.Humidity.HumidityCurrent;
import org.example.groov.domain.MotorOne.MotorOne;
import org.example.groov.domain.MotorTwo.MotorTwo;
import org.example.groov.domain.Temperature.Temperature;
import org.example.groov.domain.Temperature.TemperatureCurrent;
import org.example.groov.repos.HumidityRepo.HumidityCurrentRepo;
import org.example.groov.repos.HumidityRepo.HumidityRepo;
import org.example.groov.repos.MotorOneRepo.MotorOneCurrentRepo;
import org.example.groov.repos.MotorOneRepo.MotorOneRepo;
import org.example.groov.repos.MotorTwoRepo.MotorTwoCurrentRepo;
import org.example.groov.repos.MotorTwoRepo.MotorTwoRepo;
import org.example.groov.repos.TemperatureRepo.TemperatureCurrentRepo;
import org.example.groov.repos.TemperatureRepo.TemperatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainControllers {
    @Autowired
    private TemperatureRepo temperatureRepo;

    @Autowired
    private HumidityRepo humidityRepo;

    @Autowired
    private HumidityCurrentRepo humidityCurrentRepo;

    @Autowired
    private TemperatureCurrentRepo temperatureCurrentRepo;

    @Autowired
    private MotorOneRepo motorOneRepo;
    @Autowired
    private MotorTwoRepo motorTwoRepo;
    @Autowired
    private MotorTwoCurrentRepo motorTwoCurrentRepo;
    @Autowired
    private MotorOneCurrentRepo motorOneCurrentRepo;

    @GetMapping("/main")
    public String main(Map<String, Object> model){
        Iterable<HumidityCurrent> humidityCurrents = humidityCurrentRepo.findAll();
        model.put("humidityCurrents",humidityCurrents);
        Iterable<TemperatureCurrent>  temperatureCurrents = temperatureCurrentRepo.findAll();
        model.put("temperatureCurrents",temperatureCurrents);
        return "main";
    }


    @GetMapping("/giveAll")
    public String giveAll(Map<String, Object> model){
        Iterable<Humidity> humidities = humidityRepo.findAll();
        model.put("humidities",humidities);
        Iterable<Temperature> temperatures = temperatureRepo.findAll();
        model.put("temperatures",temperatures);
        Iterable<MotorOne> motorOnes = motorOneRepo.findAll();
        model.put("motorOnes",motorOnes);
        Iterable<MotorTwo> motorTwos = motorTwoRepo.findAll();
        model.put("motorTwos",motorTwos);
        return "giveAll";
    }
}
