package com.modal;

public class Supervisors {

  private String ID;
  private String unit;
  private String fullName;
  private String gender;
  private String yoB;
  private String homeTown;

  public Supervisors(String iD, String unit, String fullName, String gender, String yoB, String homeTown) {
    ID = iD;
    this.unit = unit;
    this.fullName = fullName;
    this.gender = gender;
    this.yoB = yoB;
    this.homeTown = homeTown;
  }

  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getYoB() {
    return yoB;
  }

  public void setYoB(String yoB) {
    this.yoB = yoB;
  }

  public String getHomeTown() {
    return homeTown;
  }

  public void setHomeTown(String homeTown) {
    this.homeTown = homeTown;
  }
}
