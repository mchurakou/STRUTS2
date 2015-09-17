package com.mikalai.struts2.action;


import com.mikalai.struts2.model.Person;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person personBean;


    @Override
    public String execute() throws Exception {

        //call Service class to store personBean's state in database

        return SUCCESS;

    }

    public void validate() {

        if (personBean.getFirstName().length() == 0) {

            addFieldError("personBean.firstName", getText("firstname.required"));

        }


        if (personBean.getEmail().length() == 0) {

            addFieldError("personBean.email", getText("email.required"));

        }

        if (personBean.getAge() < 18) {

            addFieldError("personBean.age", getText("age.required"));



        }


    }

    public Person getPersonBean() {

        return personBean;

    }

    public void setPersonBean(Person person) {

        personBean = person;

    }

}
