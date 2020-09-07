package com.saws.entity;


public class Project {

  private String proName;
  private String introduce;
  private String department;
  private String managerName;
  private String managerId;
  private long managerPhone;
  private long peopleNumber;
  private double proMoney;
  private java.sql.Date startTime;
  private java.sql.Date endTime;
  private long proState;


  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }


  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }


  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public String getManagerName() {
    return managerName;
  }

  public void setManagerName(String managerName) {
    this.managerName = managerName;
  }


  public String getManagerId() {
    return managerId;
  }

  public void setManagerId(String managerId) {
    this.managerId = managerId;
  }


  public long getManagerPhone() {
    return managerPhone;
  }

  public void setManagerPhone(long managerPhone) {
    this.managerPhone = managerPhone;
  }


  public long getPeopleNumber() {
    return peopleNumber;
  }

  public void setPeopleNumber(long peopleNumber) {
    this.peopleNumber = peopleNumber;
  }


  public double getProMoney() {
    return proMoney;
  }

  public void setProMoney(double proMoney) {
    this.proMoney = proMoney;
  }


  public java.sql.Date getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Date startTime) {
    this.startTime = startTime;
  }


  public java.sql.Date getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Date endTime) {
    this.endTime = endTime;
  }


  public long getProState() {
    return proState;
  }

  public void setProState(long proState) {
    this.proState = proState;
  }

}
