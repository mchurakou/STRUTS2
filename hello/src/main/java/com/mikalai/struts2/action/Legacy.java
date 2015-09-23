package com.mikalai.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Mikalai_Churakou on 9/21/2015.
 */
public class Legacy extends ActionSupport {
    private static final Logger logger = LogManager.getLogger();
    private String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String go() throws Exception {
        logger.info("LEGACY");
        return "legacy";
    }
}
