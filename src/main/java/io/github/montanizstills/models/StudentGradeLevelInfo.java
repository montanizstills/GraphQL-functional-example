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
public class StudentGradeLevelInfo implements Serializable {
    @Id
    @OneToOne(mappedBy = "id")
    private Student student;
    private Integer freshmanYear;
    private Integer expectedGradYear;
    private Integer major;
    private Integer minor;
    private Float gpa;
    private Boolean isInGoodAcademicStanding;
    private Integer currentCreditsCompleted;
    private Integer creditsReqToGraduate;

}


