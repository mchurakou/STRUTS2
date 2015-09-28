package com.mikalai.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.json.annotations.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mikalai_Churakou on 9/28/2015.
 */
public class ActionJSON extends ActionSupport {
    private static final Logger logger = LogManager.getLogger();

    private String field1 = "str";
    private int[] ints = {10, 20};
    private Map map = new HashMap();
    private String customName = "custom";

    //'transient' fields are not serialized
    private transient String field2;

    //fields without getter method are not serialized
    private String field3;

    public String execute() {
        logger.info("IN JSON ACTION");

        map.put("John", "Galt");
        return SUCCESS;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @JSON(name="newName")
    public String getCustomName() {
        return this.customName;
    }

}
