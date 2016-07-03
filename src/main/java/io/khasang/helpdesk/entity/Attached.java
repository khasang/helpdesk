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
}
