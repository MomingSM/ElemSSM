package org.dennis.domain;

import java.io.Serializable;
import java.util.Date;


public class GoodsCondition extends Goodsinfo implements Serializable {

    private Double minPrice;    //根据价格区间设置查询条件
    private Double maxPrice;
    private Date startDate;     //根据日期区间设置查询条件
    private Date endDate;

    public GoodsCondition() {
    }

    public GoodsCondition(Integer ginfoId, String ginfoName, String ginfoPhoto, String ginfoDes, Double ginfoPrice, Date addTime, Integer fBusid, Business business, Integer fGtype, GoodsTypes goodsTypes, Double minPrice, Double maxPrice, Date startDate, Date endDate) {
        super(ginfoId, ginfoName, ginfoPhoto, ginfoDes, ginfoPrice, addTime, fBusid, business, fGtype, goodsTypes);
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
