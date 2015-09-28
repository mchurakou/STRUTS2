package com.mikalai.struts2.action;


import com.mikalai.struts2.model.Person;
import com.mikalai.struts2.model.State;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Register extends ActionSupport implements SessionAware, ModelDriven<Person> {

    private static final long serialVersionUID = 1L;

    private Person personBean = new Person();


    private List<String> sports;


    private List<String> genders;


    private List<State> states;


    private List<String> carModelsAvailable;

    private Map<String, Object> sessionMap;


    public Register() {
        sports = new ArrayList<String>();
        sports.add("Football");
        sports.add("Basketball");

        genders = new ArrayList<String>();
        genders.add("Male");
        genders.add("Female");

        states = new ArrayList<State>();
        states.add(new State("TX", "TEXAS"));
        states.add(new State("MS", "MESSURY"));

        carModelsAvailable = new ArrayList<String>();
        carModelsAvailable.add("ford");
        carModelsAvailable.add("bmw");
    }

    @Override
    public String execute() throws Exception {

        //call Service class to store personBean's state in database

        sessionMap.put("auth", "auth");

        return SUCCESS;

    }

    public void validate() {

//        if (personBean.getFirstName().length() == 0) {
//
//            addFieldError("personBean.firstName", getText("firstname.required"));
//
//        }
//
//
//        if (personBean.getEmail().length() == 0) {
//
//            addFieldError("personBean.email", getText("email.required"));
//
//        }

        if (personBean.getAge() < 18) {

            addFieldError("age", getText("age.required"));


        }


    }

    public Person getPersonBean() {

        return personBean;

    }

    public void setPersonBean(Person person) {

        personBean = person;

    }

    public List<String> getSports() {
        return sports;
    }

    public void setSports(List<String> sports) {
        this.sports = sports;
    }


    public List<String> getGenders() {
        return genders;
    }

    public void setGenders(List<String> genders) {
        this.genders = genders;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }


    public List<String> getCarModelsAvailable() {
        return carModelsAvailable;
    }

    public void setCarModelsAvailable(List<String> carModelsAvailable) {
        this.carModelsAvailable = carModelsAvailable;
    }

    public void setSession(Map<String, Object> map) {
        sessionMap = map;
    }

    @Override
    public Person getModel() {
        return personBean;
    }
}
