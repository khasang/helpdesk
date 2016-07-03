package io.khasang.helpdesk.entity;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @Column(name="id")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
