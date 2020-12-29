package org.example.groov.domain.Humidity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class HumidityCurrent {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date dateCurrent;
    private String humidityCurrent;

    public HumidityCurrent() {

    }

    public HumidityCurrent(String humidityCurrent, Date dateCurrent) {
        this.dateCurrent = dateCurrent;
        if (humidityCurrent.length()>=4) {
            this.humidityCurrent = humidityCurrent.substring(0,4);
        } else {
            this.humidityCurrent = humidityCurrent;
        }
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

    public String getHumidityCurrent() {
        return humidityCurrent;
    }

    public void setHumidityCurrent(String humidityCurrent) {
        this.humidityCurrent = humidityCurrent;
    }
}
