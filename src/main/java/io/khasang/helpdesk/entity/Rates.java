package io.khasang.helpdesk.entity;

import javax.persistence.*;

@Entity
@Table(name = "rates")
public class Rates {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String level;

    private String critical;

    public Rates() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }
}
