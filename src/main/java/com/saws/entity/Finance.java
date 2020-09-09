package com.saws.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Finance {

    private Integer fin_id;

    private String dep_name;

    private String type;

    private BigDecimal price;

    private Date business_time;

    private String dep_no;


    public String getDep_no() {
        return dep_no;
    }

    public void setDep_no(String dep_no) {
        this.dep_no = dep_no;
    }

    public Integer getFin_id() {
        return fin_id;
    }

    public void setFin_id(Integer fin_id) {
        this.fin_id = fin_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getBusiness_time() {
        return business_time;
    }

    public void setBusiness_time(Date business_time) {
        this.business_time = business_time;
    }
}
