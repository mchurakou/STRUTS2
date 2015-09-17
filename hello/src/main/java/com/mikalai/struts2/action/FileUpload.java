package com.mikalai.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;


public class FileUpload extends ActionSupport {
    File pic;
    String picContentType;
    String picFileName;

    public File getPic() {
        return pic;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    public String getPicContentType() {
        return picContentType;
    }

    void setPicContentType(String picContentType) {
        this.picContentType = picContentType;
    }

    public void setPicFileName(String picFileName) {
        this.picFileName = picFileName;
    }

    public String getPicFileName() {
        return picFileName;
    }


    public String execute() {
        return SUCCESS;
    }
}
