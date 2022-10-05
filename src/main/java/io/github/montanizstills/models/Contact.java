package io.github.montanizstills.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Contact implements Serializable {

    @OneToOne(optional = false, mappedBy = "id", cascade = CascadeType.ALL)
    private Student student;
    @OneToOne
    private Address address;
    private String email;
    private String workPhone;
    private String mobilePhone;

    @Id
    public String getId() {
        return this.student.getId();
    }

    public void setId(String id) {
        this.student.setId(id);
    }
}
