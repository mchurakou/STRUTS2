package com.mikalai.struts2.model;

public class MessageStore {

    private String message;

    public MessageStore() {

        setMessage("Hello Struts User");
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }

}
