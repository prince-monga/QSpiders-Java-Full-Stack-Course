package com.jsp;

public class Car {


    private  String car_company;
    private String car_color;
    private double car_price;

    public Car(String car_company, String car_color, double car_price) {
        this.car_company = car_company;
        this.car_color = car_color;
        this.car_price = car_price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_company='" + car_company + '\'' +
                ", car_color='" + car_color + '\'' +
                ", car_price=" + car_price +
                '}';
    }
}
