package org.example.groov.domain.MotorOne;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MotorOneCurrent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date dateCurrent;
    private String motorOneCurrent;


    public MotorOneCurrent(Date dateCurrent, String motorOneCurrent) {
        this.dateCurrent = dateCurrent;
        this.motorOneCurrent = motorOneCurrent;
    }


    public MotorOneCurrent(){

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

    public String getMotorOneCurrent() {
        return motorOneCurrent;
    }

    public void setMotorOneCurrent(String motorOneCurrent) {
        this.motorOneCurrent = motorOneCurrent;
    }
}
