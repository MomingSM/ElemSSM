package org.dennis.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@JsonIgnoreProperties(value = {"handler"})
public class Goodsinfo implements Serializable {
    private Integer ginfoId;

    private String ginfoName;

    private String ginfoPhoto;

    private String ginfoDes;

    private Double ginfoPrice;

    private Date addTime;

    private Integer fBusid;

    private Business business;

    private Integer fGtype;

    private GoodsTypes goodsTypes;

    public Integer getGinfoId() {
        return ginfoId;
    }

    public void setGinfoId(Integer ginfoId) {
        this.ginfoId = ginfoId;
    }

    public String getGinfoName() {
        return ginfoName;
    }

    public void setGinfoName(String ginfoName) {
        this.ginfoName = ginfoName;
    }

    public String getGinfoPhoto() {
        return ginfoPhoto;
    }

    public void setGinfoPhoto(String ginfoPhoto) {
        this.ginfoPhoto = ginfoPhoto;
    }

    public String getGinfoDes() {
        return ginfoDes;
    }

    public void setGinfoDes(String ginfoDes) {
        this.ginfoDes = ginfoDes;
    }

    public Double getGinfoPrice() {
        return ginfoPrice;
    }

    public void setGinfoPrice(Double ginfoPrice) {
        this.ginfoPrice = ginfoPrice;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getfBusid() {
        return fBusid;
    }

    public void setfBusid(Integer fBusid) {
        this.fBusid = fBusid;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Integer getfGtype() {
        return fGtype;
    }

    public void setfGtype(Integer fGtype) {
        this.fGtype = fGtype;
    }

    public GoodsTypes getGoodsTypes() {
        return goodsTypes;
    }

    public void setGoodsTypes(GoodsTypes goodsTypes) {
        this.goodsTypes = goodsTypes;
    }

    public Goodsinfo(Integer ginfoId, String ginfoName, String ginfoPhoto, String ginfoDes, Double ginfoPrice, Date addTime, Integer fBusid, Business business, Integer fGtype, GoodsTypes goodsTypes) {
        this.ginfoId = ginfoId;
        this.ginfoName = ginfoName;
        this.ginfoPhoto = ginfoPhoto;
        this.ginfoDes = ginfoDes;
        this.ginfoPrice = ginfoPrice;
        this.addTime = addTime;
        this.fBusid = fBusid;
        this.business = business;
        this.fGtype = fGtype;
        this.goodsTypes = goodsTypes;
    }

    public Goodsinfo() {
    }
}