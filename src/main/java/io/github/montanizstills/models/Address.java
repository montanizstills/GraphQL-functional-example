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
    @Id
    @OneToOne(optional = false,mappedBy = "id")
    private Student student;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String state;
    private Integer postalCode;
    private String country;

    public Address usingAddressLine1(String addressLine1){
        this.setAddressLine1(addressLine1);
        return this;
    }
}
