package com.mikalai.struts2.model;

import javax.validation.constraints.Min;

/**
 * Created by Mikalai_Churakou on 9/30/2015.
 */
public class Home {
    @Min(5)
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
