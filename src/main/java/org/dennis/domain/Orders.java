package org.dennis.domain;

import java.util.Date;

public class Orders {
    private Integer orderId;

    private String orderName;

    private Integer orderCnt;

    private String orderPaystatus;

    private Date addTime;

    private Integer fCid;

    private Integer fBusid;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getOrderCnt() {
        return orderCnt;
    }

    public void setOrderCnt(Integer orderCnt) {
        this.orderCnt = orderCnt;
    }

    public String getOrderPaystatus() {
        return orderPaystatus;
    }

    public void setOrderPaystatus(String orderPaystatus) {
        this.orderPaystatus = orderPaystatus;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getfCid() {
        return fCid;
    }

    public void setfCid(Integer fCid) {
        this.fCid = fCid;
    }

    public Integer getfBusid() {
        return fBusid;
    }

    public void setfBusid(Integer fBusid) {
        this.fBusid = fBusid;
    }
}