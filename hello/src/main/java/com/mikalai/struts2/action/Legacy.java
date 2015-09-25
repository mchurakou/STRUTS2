package com.mikalai.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import javax.inject.Inject;
import java.util.Map;

/**
 * Created by Mikalai_Churakou on 9/21/2015.
 */
public class Legacy extends ActionSupport implements SessionAware, ScopedModelDriven<MyForm> {
    private static final Logger logger = LogManager.getLogger();
    private MyForm form;
    private Map<String, Object> session;
    private String formKey;

    @Inject
    private TestInjection testInjection;

    public MyForm getForm() {
        return form;
    }

    public void setForm(MyForm form) {
        this.form = form;
    }

    public String go() throws Exception {
        logger.info("LEGACY ACTION");
        MyForm form = (MyForm)session.get(formKey);
        logger.info("SESSION CONTENT:" + form.getFormName());

        return "legacy";
    }

    public void validate(){

        logger.info("VALIDATE ACTION");
        form.validate();


    }


    public void setModel(MyForm model) {
        form = model;
    }

    public void setScopeKey(String key) {
        formKey= key;
    }

    public String getScopeKey() {
        return null;
    }

    public MyForm getModel() {
        return form;
    }

    public void setSession(Map<String, Object> map) {
        session = map;
    }
}
