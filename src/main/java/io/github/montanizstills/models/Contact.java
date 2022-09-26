package io.github.montanizstills.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Contact{
    @Id
    @OneToOne
    private Student student;
    @OneToOne
    private Address address;
    private String email;
    private String workPhone;
    private String mobilePhone;

    public Contact() {
    }

    public Contact(Student student, Address address, String email, String workPhone, String mobilePhone) {
        this.student = student;
        this.address = address;
        this.email = email;
        this.workPhone = workPhone;
        this.mobilePhone = mobilePhone;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
