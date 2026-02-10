package com.jsp;

public class Customer {
    private int custId;
    private String custName;

    public Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                '}';
    }
}
