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

    @OneToOne(optional = false, mappedBy = "id", cascade = CascadeType.ALL)
    private Student student;
    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Class> classes;

    @Id
    public String getId() {
        return this.student.getId();
    }

    public void setId(String id) {
        this.student.setId(id);
    }
}
