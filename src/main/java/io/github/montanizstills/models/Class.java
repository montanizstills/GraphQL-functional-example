package io.github.montanizstills.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Class {
    @Id @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY) @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;
    private String semester;

    public Class() {
    }

    public Class(String id, String name, String semester) {
        this.id = id;
        this.name = name;
        this.semester = semester;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
