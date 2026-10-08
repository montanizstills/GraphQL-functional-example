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
public class StudentGradeLevelInfo implements Serializable {

    @OneToOne(optional = false, mappedBy = "id", cascade = CascadeType.ALL)
    private Student student;
    private Integer freshmanYear;
    private Integer expectedGradYear;
    private Integer major;
    private Integer minor;
    private Float gpa;
    private Boolean isInGoodAcademicStanding;
    private Integer currentCreditsCompleted;
    private Integer creditsReqToGraduate;

    @Id
    public String getId() {
        return this.student.getId();
    }

    public void setId(String id) {
        this.student.setId(id);
    }
}


