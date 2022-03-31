package com.example.demo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("Portland")
    private String city;
    @Value("Oregon")
    private String state;
    @Value("Multnomah")
    private String county;
    @Value("97209")
    private String zip;
    
    public Address() {}

    public Address(String city, String state, String county, String zip) {
        this.city = city;
        this.state = state;
        this.county = county;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }
    public void setCounty(String county) {
        this.county = county;
    }

    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "\nCity: " + city +
                "\nState: " + state +
                "\nCounty: " + county +
                "\nZipcode: " + zip;
    }
}
