package org.dennis.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@JsonIgnoreProperties(value = {"handler"})
public class GoodsTypes implements Serializable {
    private Integer gtypId;

    private String gtypName;

    private Date addTime;

    public Integer getGtypId() {
        return gtypId;
    }

    public void setGtypId(Integer gtypId) {
        this.gtypId = gtypId;
    }

    public String getGtypName() {
        return gtypName;
    }

    public void setGtypName(String gtypName) {
        this.gtypName = gtypName;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}