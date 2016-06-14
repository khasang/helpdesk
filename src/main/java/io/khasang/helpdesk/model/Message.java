package io.khasang.helpdesk.model;

/**
 * Created by Mike on 14.06.2016.
 */
public class Message {
    public Message() {

    }

    private String info;

    private String infoMess="test";

    public String getInfoMess() {
        return infoMess;
    }

    public void setInfoMess(String infoMess) {
        this.infoMess = infoMess;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
