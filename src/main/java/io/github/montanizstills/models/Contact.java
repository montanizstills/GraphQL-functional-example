package io.github.montanizstills.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Contact implements Serializable {
    @Id
    @OneToOne(mappedBy = "id")
    private Student student;
    @OneToOne
    private Address address;
    private String email;
    private String workPhone;
    private String mobilePhone;


}
