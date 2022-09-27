package io.github.montanizstills.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Schedule implements Serializable {
    @Id
    @OneToOne(optional = false,mappedBy = "id")
    private Student student;
    @OneToMany @ToString.Exclude
    private List<Class> classes;


}
