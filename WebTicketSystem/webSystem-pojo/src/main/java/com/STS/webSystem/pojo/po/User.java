package com.STS.webSystem.pojo.po;

import java.io.Serializable;

public class User implements Serializable {
    private String uid;

    private String username;

    private String password;

    private String realname;

    private String telephone;

    private Double balance;

    private static final long serialVersionUID = 1L;

    public User(String uid, String username, String password, String realname, String telephone, Double balance) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.telephone = telephone;
        this.balance = balance;
    }

    public User() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}