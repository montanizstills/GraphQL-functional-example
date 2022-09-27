package io.github.montanizstills.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Contact implements Serializable {
    @Id
    @OneToOne(optional = false,mappedBy = "id")
    private Student student;
    @OneToOne
    private Address address;
    private String email;
    private String workPhone;
    private String mobilePhone;


}
