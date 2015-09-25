package com.mikalai.struts2.action;

import javax.annotation.PostConstruct;

/**
 * Created by Mikalai_Churakou on 9/25/2015.
 */
public class TestInjection {
    private String test;

    @PostConstruct
    public void init(){
        test = "constructed";
    }
}
