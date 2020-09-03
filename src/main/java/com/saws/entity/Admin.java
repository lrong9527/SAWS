package com.saws.entity;

public class Admin {
    String ad_id;
    String ad_password;
    String ad_name;
    String ad_phone;
    Integer ad_flag;

    public String getAd_id() {
        return ad_id;
    }

    public void setAd_id(String ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_password() {
        return ad_password;
    }

    public void setAd_password(String ad_password) {
        this.ad_password = ad_password;
    }

    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

    public String getAd_phone() {
        return ad_phone;
    }

    public void setAd_phone(String ad_phone) {
        this.ad_phone = ad_phone;
    }

    public Integer getAd_flag() {
        return ad_flag;
    }

    public void setAd_flag(Integer ad_flag) {
        this.ad_flag = ad_flag;
    }
}
