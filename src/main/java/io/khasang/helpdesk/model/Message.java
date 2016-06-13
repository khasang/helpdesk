package io.khasang.helpdesk.model;


public class Message {
    private String info;
    private String infoMess = "22";

    public Message() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfoMess() {
        return infoMess;
    }

    public void setInfoMess(String infoMess) {
        this.infoMess = infoMess;
    }
}
