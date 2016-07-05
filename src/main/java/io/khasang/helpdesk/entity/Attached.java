package io.khasang.helpdesk.entity;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "Attached")
public class Attached {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private File file;

    public Attached() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
