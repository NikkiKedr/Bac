package org.example.groov.domain.MotorTwo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MotorTwo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date dateCurrent;
    private String povorot;

    public MotorTwo(Date dateCurrent, String povorot) {
        this.dateCurrent = dateCurrent;
        this.povorot = povorot;
    }
    public MotorTwo(){

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

    public String getPovorot() {
        return povorot;
    }

    public void setPovorot(String povorot) {
        this.povorot = povorot;
    }
}
