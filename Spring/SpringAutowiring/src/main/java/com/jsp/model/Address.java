package com.jsp.model;

public class Address {
    private String city;
    private String houseNo;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "{" +
                "city='" + city + '\'' +
                ", houseNo='" + houseNo + '\'' +
                '}';
    }
}
