package io.khasang.helpdesk.entity;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String name;


    private String description;

    public Departments() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}