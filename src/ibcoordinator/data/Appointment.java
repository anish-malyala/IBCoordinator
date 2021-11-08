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
public class Appointment {

    private String id;

    private Student student;
    private String type;
    private String subject;
    private String meetingDate;
    private String slot;

    public Appointment() {
        setId(UUID.randomUUID().toString());
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String[] getDetails() {
        return new String[]{getId(), getType(), getSubject(), getMeetingDate(), getSlot(), getStudent().getName()};
    }

}
