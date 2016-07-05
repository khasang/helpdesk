package io.khasang.helpdesk.entity;

import javax.persistence.*;

@Entity
@Table(name = "history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int tasksId;

    public History() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTasksId() {
        return tasksId;
    }

    public void setTasksId(int tasksId) {
        this.tasksId = tasksId;
    }
}
