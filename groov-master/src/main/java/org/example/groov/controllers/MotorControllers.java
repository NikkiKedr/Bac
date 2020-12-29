package org.example.groov.controllers;

import org.example.groov.domain.MotorOne.MotorOne;
import org.example.groov.domain.MotorOne.MotorOneCurrent;
import org.example.groov.domain.MotorTwo.MotorTwo;
import org.example.groov.domain.MotorTwo.MotorTwoCurrent;
import org.example.groov.repos.MotorOneRepo.MotorOneCurrentRepo;
import org.example.groov.repos.MotorOneRepo.MotorOneRepo;
import org.example.groov.repos.MotorTwoRepo.MotorTwoCurrentRepo;
import org.example.groov.repos.MotorTwoRepo.MotorTwoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class MotorControllers {

    @Autowired
    private MotorOneRepo motorOneRepo;

    @Autowired
    private MotorOneCurrentRepo motorOneCurrentRepo;


    @Autowired
    private MotorTwoRepo motorTwoRepo;

    @Autowired
    private MotorTwoCurrentRepo motorTwoCurrentRepo;


    @GetMapping("/Motor1")
    public String motorOne(@RequestParam String motor, Map<String,Object> model){
        Date date = new Date();
        if (motor.equals("CLOSE")){
            MotorOne motorOne = new MotorOne(date,"CLOSE");
            MotorOneCurrent motorOneCurrent = new MotorOneCurrent(date,"0");
            motorOneCurrentRepo.deleteAll();
            motorOneCurrentRepo.save(motorOneCurrent);
            motorOneRepo.save(motorOne);
        }
        if (motor.equals("OPEN")){
            MotorOne motorOne = new MotorOne(date,"OPEN");
            MotorOneCurrent motorOneCurrent = new MotorOneCurrent(date,"170");
            motorOneCurrentRepo.deleteAll();
            motorOneCurrentRepo.save(motorOneCurrent);
            motorOneRepo.save(motorOne);
        }
        return "main";
    }


    @GetMapping("/Motor2")
    public String motorTwo(@RequestParam String motor, Map<String,Object> model){
        Date date = new Date();
        if (motor.equals("CLOSE")){
            MotorTwo motorTwo = new MotorTwo(date,"CLOSE");
            MotorTwoCurrent motorTwoCurrent = new MotorTwoCurrent(date,"0");
            motorTwoCurrentRepo.deleteAll();
            motorTwoCurrentRepo.save(motorTwoCurrent);
            motorTwoRepo.save(motorTwo);
        }
        if (motor.equals("OPEN")){
            MotorTwo motorTwo = new MotorTwo(date,"OPEN");
            MotorTwoCurrent motorTwoCurrent = new MotorTwoCurrent(date,"170");
            motorTwoCurrentRepo.deleteAll();
            motorTwoCurrentRepo.save(motorTwoCurrent);
            motorTwoRepo.save(motorTwo);
        }
        return "main";
    }

}
