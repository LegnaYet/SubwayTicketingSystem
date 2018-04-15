package com.STS.machine.pojo.po;

import java.io.Serializable;

public class Order implements Serializable {
    private String oid;

    private Integer beginid;

    private String beginname;

    private Integer endid;

    private String endname;

    private Integer ticnum;

    private Double price;

    private static final long serialVersionUID = 1L;

    public Order(String oid, Integer beginid, String beginname, Integer endid, String endname, Integer ticnum, Double price) {
        this.oid = oid;
        this.beginid = beginid;
        this.beginname = beginname;
        this.endid = endid;
        this.endname = endname;
        this.ticnum = ticnum;
        this.price = price;
    }

    public Order() {
        super();
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Integer getBeginid() {
        return beginid;
    }

    public void setBeginid(Integer beginid) {
        this.beginid = beginid;
    }

    public String getBeginname() {
        return beginname;
    }

    public void setBeginname(String beginname) {
        this.beginname = beginname == null ? null : beginname.trim();
    }

    public Integer getEndid() {
        return endid;
    }

    public void setEndid(Integer endid) {
        this.endid = endid;
    }

    public String getEndname() {
        return endname;
    }

    public void setEndname(String endname) {
        this.endname = endname == null ? null : endname.trim();
    }

    public Integer getTicnum() {
        return ticnum;
    }

    public void setTicnum(Integer ticnum) {
        this.ticnum = ticnum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}