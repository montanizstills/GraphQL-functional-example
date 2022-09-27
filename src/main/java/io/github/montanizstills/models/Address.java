package io.github.montanizstills.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Address implements Serializable {
    @Id
    @OneToOne(mappedBy = "id")
    private Student student;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String state;
    private Integer postalCode;
    private String country;


}
