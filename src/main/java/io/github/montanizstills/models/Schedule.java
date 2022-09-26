package io.github.montanizstills.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Schedule  {
    @Id
    @OneToOne
    private Student student;
    @OneToMany
    private List<Class> classes;

    public Schedule() {
    }

    public Schedule(Student student, List<Class> classes) {
        this.student = student;
        this.classes = classes;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
}
