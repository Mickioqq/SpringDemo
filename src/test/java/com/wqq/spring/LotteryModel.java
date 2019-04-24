package com.wqq.spring;

public class LotteryModel {
    private Integer id;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "LotteryModel{" +
                "id=" + id +
                ", ratio=" + ratio +
                ", orderNumber='" + orderNumber + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    private double ratio;

    public LotteryModel(Integer id,double ratio,String orderNumber){
        this.id=id;
        this.ratio=ratio;
        this.orderNumber=orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String orderNumber;
}
