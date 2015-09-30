package com.mikalai.struts2.model;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * Created by Mikalai_Churakou on 9/30/2015.
 */
public class Address {

    @Size(min = 4, message="city.required")
    private String city;

    @Size(min = 4, message="street.required")
    private String street;

    @Valid
    private Home home;

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
