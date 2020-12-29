package org.example.groov.domain.Temperature;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TemperatureCurrent {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String temperatureCurrent;
    private Date date;

    public TemperatureCurrent() {
    }

    public TemperatureCurrent(String temperatureCurrent, Date date) {
        if (temperatureCurrent.length()>=4) {
            this.temperatureCurrent = temperatureCurrent.substring(0,4);
        } else {
            this.temperatureCurrent = temperatureCurrent;
        }
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemperatureCurrent() {
        return temperatureCurrent;
    }

    public void setTemperatureCurrent(String temperatureCurrent) {
        this.temperatureCurrent = temperatureCurrent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
