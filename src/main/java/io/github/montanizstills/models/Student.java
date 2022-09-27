package io.github.montanizstills.models;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid", strategy = "uuid2")
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



}
