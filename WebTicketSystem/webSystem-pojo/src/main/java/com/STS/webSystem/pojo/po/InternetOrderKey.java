package com.STS.webSystem.pojo.po;

import java.io.Serializable;

public class InternetOrderKey implements Serializable {
    private String oid;

    private String state;

    private static final long serialVersionUID = 1L;

    public InternetOrderKey(String oid, String state) {
        this.oid = oid;
        this.state = state;
    }

    public InternetOrderKey() {
        super();
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}