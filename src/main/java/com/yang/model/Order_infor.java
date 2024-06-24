package com.yang.model;

import java.util.Date;

public class Order_infor {
    private int oid;
    private String uname;

    private String fname;

    private String sname;

    private Date stime;
    private Date btime;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    @Override
    public String toString() {
        return "Order_infor{" +
                "oid=" + oid +
                ", uname='" + uname + '\'' +
                ", fname='" + fname + '\'' +
                ", sname='" + sname + '\'' +
                ", stime=" + stime +
                ", btime=" + btime +
                '}';
    }
}
