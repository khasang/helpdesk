package io.khasang.helpdesk.entity;

import javax.persistence.*;

import static org.hibernate.envers.DefaultRevisionEntity_.id;

@Entity
public class goods {

    public goods(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Transient
    private String optional;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
