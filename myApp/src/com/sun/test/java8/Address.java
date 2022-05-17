package com.sun.test.java8;

import java.util.List;

public class Address {


    private int id;

    private String address1;

    private String address2;

    private String postalCode;

    private String landmark;

    private String contactNumber;

    private boolean permanent;


    public Address(int id, String address1, String address2,String postalCode,String landmark,String contactNumber,boolean permanent) {

        this.id = id;
        this.address1 = address1;
        this.address2 = address2;
        this.postalCode = postalCode;
        this.landmark = landmark;
        this.contactNumber = contactNumber;
        this.permanent = permanent;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    @Override
    public String toString() {
        return
                "Address Id: "+this.getId()
                        +", Address1: "+this.getAddress1()
                        +", Address2: "+this.getAddress2()
                        +", PostalCode: "+this.getPostalCode()
                        +", landmark: "+this.getLandmark()
                        +"contactNumber: "+this.getContactNumber()
                        +"Permanent: "+this.isPermanent();
    }


}
