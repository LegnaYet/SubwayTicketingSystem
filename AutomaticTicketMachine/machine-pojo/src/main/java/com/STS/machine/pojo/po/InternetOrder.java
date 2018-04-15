package com.STS.machine.pojo.po;

import java.io.Serializable;

public class InternetOrder extends InternetOrderKey implements Serializable {
    private Integer beginid;

    private String beginname;

    private Integer endid;

    private String endname;

    private Integer ticnum;

    private Double price;

    private String telephone;

    private String verificationcode;

    private static final long serialVersionUID = 1L;

    public InternetOrder(String oid, String state, Integer beginid, String beginname, Integer endid, String endname, Integer ticnum, Double price, String telephone, String verificationcode) {
        super(oid, state);
        this.beginid = beginid;
        this.beginname = beginname;
        this.endid = endid;
        this.endname = endname;
        this.ticnum = ticnum;
        this.price = price;
        this.telephone = telephone;
        this.verificationcode = verificationcode;
    }

    public InternetOrder() {
        super();
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getVerificationcode() {
        return verificationcode;
    }

    public void setVerificationcode(String verificationcode) {
        this.verificationcode = verificationcode == null ? null : verificationcode.trim();
    }
}