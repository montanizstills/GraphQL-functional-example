package io.github.montanizstills.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Student {
    @Id @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY) @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;
    @OneToOne
    private Contact contact;
    @OneToOne
    private Address address;
    @OneToOne
    private Schedule schedule;
    @OneToOne
    private StudentGradeLevelInfo studentGradeLevelInfo;


    public Student() {
    }

    public Student(String id, String name, Contact contact, Address address, StudentGradeLevelInfo studentGradeLevelInfo) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.studentGradeLevelInfo = studentGradeLevelInfo;
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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public StudentGradeLevelInfo getStudentGradeLevelInfo() {
        return studentGradeLevelInfo;
    }

    public void setStudentGradeLevelInfo(StudentGradeLevelInfo studentGradeLevelInfo) {
        this.studentGradeLevelInfo = studentGradeLevelInfo;
    }

}
