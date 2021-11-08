/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibcoordinator.data;

import java.util.UUID;

/**
 * @author AnishMalyala
 */
public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String emailAddress;
    private String curriculum;
    private String classDetails;
    public Student() {
        setId(UUID.randomUUID().toString());
    }
    public Student(String name, String dateOfBirth, String emailAddress, String curriculum, String classDetails) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.curriculum = curriculum;
        this.classDetails = classDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {

        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getClassDetails() {
        return classDetails;
    }

    public void setClassDetails(String classDetails) {
        this.classDetails = classDetails;
    }


    public String[] getDetails() {
        return new String[]{getId(), getName(), getClassDetails(), getCurriculum(), getEmailAddress()};
    }


}
