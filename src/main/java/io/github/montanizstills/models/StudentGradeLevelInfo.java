package io.github.montanizstills.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class StudentGradeLevelInfo implements Serializable {
    @Id @OneToOne
    private Student student;
    private Integer freshmanYear;
    private Integer expectedGradYear;
    private Integer major;
    private Integer minor;
    private Float gpa;
    private Boolean isInGoodAcademicStanding;
    private Integer currentCreditsCompleted;
    private Integer creditsReqToGraduate;

    public StudentGradeLevelInfo() {
    }

    public StudentGradeLevelInfo(Student student, Integer freshmanYear, Integer expectedGradYear, Integer major, Integer minor, Float gpa, Boolean isInGoodAcademicStanding, Integer currentCreditsCompleted, Integer creditsReqToGraduate) {
        this.student = student;
        this.freshmanYear = freshmanYear;
        this.expectedGradYear = expectedGradYear;
        this.major = major;
        this.minor = minor;
        this.gpa = gpa;
        this.isInGoodAcademicStanding = isInGoodAcademicStanding;
        this.currentCreditsCompleted = currentCreditsCompleted;
        this.creditsReqToGraduate = creditsReqToGraduate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getFreshmanYear() {
        return freshmanYear;
    }

    public void setFreshmanYear(Integer freshmanYear) {
        this.freshmanYear = freshmanYear;
    }

    public Integer getExpectedGradYear() {
        return expectedGradYear;
    }

    public void setExpectedGradYear(Integer expectedGradYear) {
        this.expectedGradYear = expectedGradYear;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public Integer getMinor() {
        return minor;
    }

    public void setMinor(Integer minor) {
        this.minor = minor;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public Boolean getInGoodAcademicStanding() {
        return isInGoodAcademicStanding;
    }

    public void setInGoodAcademicStanding(Boolean inGoodAcademicStanding) {
        isInGoodAcademicStanding = inGoodAcademicStanding;
    }

    public Integer getCurrentCreditsCompleted() {
        return currentCreditsCompleted;
    }

    public void setCurrentCreditsCompleted(Integer currentCreditsCompleted) {
        this.currentCreditsCompleted = currentCreditsCompleted;
    }

    public Integer getCreditsReqToGraduate() {
        return creditsReqToGraduate;
    }

    public void setCreditsReqToGraduate(Integer creditsReqToGraduate) {
        this.creditsReqToGraduate = creditsReqToGraduate;
    }
}


