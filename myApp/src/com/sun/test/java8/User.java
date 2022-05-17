package com.sun.test.java8;

public class User {

    private String name;
    private int age;
    private double depositAmount;

    public User(){}
    public User(String name, int age, double depositAmount){
        this.name = name;
        this.age =age;
        this.depositAmount = depositAmount;
    }

    @Override
    public String toString() {
        return
                "Name: "+this.getName()
                        +", Age: "+this.getAge()
                        +", DepositAmount: "+this.getDepositAmount();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
}
