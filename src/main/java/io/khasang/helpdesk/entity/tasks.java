package io.khasang.helpdesk.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tasks")
public class Tasks {
    private long id;
    private long user_id;
    private String comment;
    private Date date;
    private Date date_created;
    private Date last_change;
    private Date close_date;
    private long rates_id;
    private String state;
    }


