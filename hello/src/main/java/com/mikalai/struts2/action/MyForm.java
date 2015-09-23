package com.mikalai.struts2.action;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Mikalai_Churakou on 9/23/2015.
 */
public class MyForm extends ValidatorForm {
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest req) {
        ActionErrors errors = super.validate(mapping, req);
        System.out.println("VALIDATE");
        return errors;
    }
}
