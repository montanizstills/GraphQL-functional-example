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
public class Address implements Serializable {

    @OneToOne(optional = false, mappedBy = "id", cascade = CascadeType.ALL)
    private Student student;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String state;
    private Integer postalCode;
    private String country;

    @Id
    public String getId() {
        return this.student.getId();
    }

    public void setId(String id) {
        this.student.setId(id);
    }
}
