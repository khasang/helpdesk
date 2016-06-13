package io.khasang.helpdesk.model;

/**
 * Created by Alexander-PC on 13.06.2016.
 */
public class Message {
    private String info;

    public String getInfoMess() {
        return infoMess;
    }

    public void setInfoMess(String infoMess) {
        this.infoMess = infoMess;
    }

    private String infoMess = "22";

    public Message() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
