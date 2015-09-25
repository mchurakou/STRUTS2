package com.mikalai.struts2.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Mikalai_Churakou on 9/23/2015.
 */
public class MyForm  {
    private static final Logger logger = LogManager.getLogger();
    private String formName;

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public void validate() {
        logger.info("VALIDATE form");
    }
}
