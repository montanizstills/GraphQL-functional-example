package io.github.montanizstills.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Schedule implements Serializable {
    @Id
    @OneToOne(mappedBy = "id")
    private Student student;
    @OneToMany
    private List<Class> classes;


}
