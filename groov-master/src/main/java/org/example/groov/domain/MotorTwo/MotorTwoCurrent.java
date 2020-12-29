package org.example.groov.domain.MotorTwo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MotorTwoCurrent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date dateCurrent;
    private String motorTwoCurrent;

    public MotorTwoCurrent(Date dateCurrent, String motorTwoCurrent) {
        this.dateCurrent = dateCurrent;
        this.motorTwoCurrent = motorTwoCurrent;
    }
    public MotorTwoCurrent(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCurrent() {
        return dateCurrent;
    }

    public void setDateCurrent(Date dateCurrent) {
        this.dateCurrent = dateCurrent;
    }

    public String getMotorTwoCurrent() {
        return motorTwoCurrent;
    }

    public void setMotorTwoCurrent(String motorTwoCurrent) {
        this.motorTwoCurrent = motorTwoCurrent;
    }
}
