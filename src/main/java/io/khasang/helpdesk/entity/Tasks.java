package io.khasang.helpdesk.entity;

import javax.persistence.*;
import java.sql.Date;

import static java.time.LocalDateTime.now;

@Entity
@Table(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "description")
    private String desc;

    @Column(name = "comment")
    private String comment;

    @Column(name = "last_change")
    private boolean lastChange;

    @Column(name = "close_date")
    private Date closeDate;

    @Column(name = "rates_id")
    private long rates_id;

    @Column(name = "state")
    private String state;

    @Column(name = "data_created")
    private Date dataCreated;

    public Tasks() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isLastChange() {
        return lastChange;
    }

    public void setLastChange(boolean lastChange) {
        this.lastChange = lastChange;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public long getRates_id() {
        return rates_id;
    }

    public void setRates_id(long rates_id) {
        this.rates_id = rates_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Date dataCreated) {
        this.dataCreated = dataCreated;
    }
}

