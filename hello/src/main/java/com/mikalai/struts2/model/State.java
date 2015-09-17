package com.mikalai.struts2.model;

/**
 * Created by Mikalai_Churakou on 9/17/2015.
 */
public class State {
    private String stateAbbr;
    private String stateName;

    public State() {
    }

    public State(String stateAbbr, String stateName) {
        this.stateAbbr = stateAbbr;
        this.stateName = stateName;
    }

    public String getStateAbbr() {

        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
