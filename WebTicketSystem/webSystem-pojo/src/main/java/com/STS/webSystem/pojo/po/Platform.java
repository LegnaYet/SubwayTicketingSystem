package com.STS.webSystem.pojo.po;

import java.io.Serializable;

public class Platform implements Serializable {
    private Integer pid;

    private String pname;

    private Integer routeid;

    private static final long serialVersionUID = 1L;

    public Platform(Integer pid, String pname, Integer routeid) {
        this.pid = pid;
        this.pname = pname;
        this.routeid = routeid;
    }

    public Platform() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getRouteid() {
        return routeid;
    }

    public void setRouteid(Integer routeid) {
        this.routeid = routeid;
    }
}