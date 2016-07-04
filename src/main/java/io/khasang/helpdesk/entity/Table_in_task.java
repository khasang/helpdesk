package io.khasang.helpdesk.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity
@Table(name = "item")
public class Table_in_task {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "descriptions")
    private String description;

    @Column(name = "comment")
    private String comment;

    @Column(name = "date(now())")
    private Data date;

    @Column(name = "created")
    private Data created;

    @Column(name = "last_change")
    private Data last_change;

    @Column(name = "close_date")
    private Data close_date;

    @Column(name = "rates_id")
    private int rates_id;

    @Column(name = "state")
    private String state;

    public Table_in_task() {
    }

    public Table_in_task(int id, int user_id, String description, String comment,
                         Data date, Data created, Data last_change, Data close_date, int rates_id, String state) {
        super();
        this.id = id;
        this.user_id = user_id;
        this.description = description;
        this.comment = comment;
        this.date = date;
        this.created = created;
        this.last_change = last_change;
        this.close_date = close_date;
        this.rates_id = rates_id;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public Data getCreated() {
        return created;
    }

    public void setCreated(Data created) {
        this.created = created;
    }

    public Data getLast_change() {
        return last_change;
    }

    public void setLast_change(Data last_change) {
        this.last_change = last_change;
    }

    public Data getClose_date() {
        return close_date;
    }

    public void setClose_date(Data close_date) {
        this.close_date = close_date;
    }

    public int getRates_id() {
        return rates_id;
    }

    public void setRates_id(int rates_id) {
        this.rates_id = rates_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
