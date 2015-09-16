package com.mikalai.struts2.action;

import com.mikalai.struts2.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private MessageStore messageStore;

    private String name;


    public String execute() throws Exception {


        messageStore = new MessageStore();

        if (name != null) {
            messageStore.setMessage("Hello " + name + "!");
        }
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
