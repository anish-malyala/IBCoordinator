/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibcoordinator.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author AnishMalyala
 */
public class GlobalData {

    private static HashMap data = new HashMap();
    private static String STUDENT_KEY = "STUDENTS";
    private static String APPOINTMENT_KEY = "APPOINTMENTS";
    private static String EVENT_KEY = "EVENTS";

    public static void addStudent(Student student) {
        List<Student> studentList = (ArrayList) data.get(STUDENT_KEY);
        if (studentList != null) {
            studentList.add(student);
        } else {
            studentList = new ArrayList<>();
            studentList.add(student);
            data.put(STUDENT_KEY, studentList);
        }
    }

    public static void addAppointment(Appointment appointment) {
        List<Appointment> appointments = (ArrayList) data.get(APPOINTMENT_KEY);
        if (appointments != null) {
            appointments.add(appointment);
        } else {
            appointments = new ArrayList<>();
            appointments.add(appointment);
            data.put(APPOINTMENT_KEY, appointments);
        }
    }

    public static List<Appointment> getAllAppointments() {
        return (List<Appointment>) data.get(APPOINTMENT_KEY);
    }

    public static void addEvent(Event event) {
        List<Event> events = (ArrayList) data.get(EVENT_KEY);
        if (events != null) {
            events.add(event);
        } else {
            events = new ArrayList<>();
            events.add(event);
            data.put(EVENT_KEY, events);
        }
    }

    public static List<Event> getAllEvents() {
        return (List<Event>) data.get(EVENT_KEY);
    }

    public static List<Student> getAllStudents() {
        return (List<Student>) data.get(STUDENT_KEY);
    }

    public static Appointment getAppointment(int index) {
        List<Appointment> appointments = (ArrayList) data.get(APPOINTMENT_KEY);
        if (appointments != null) {
            return appointments.get(index);
        }
        return null;
    }

    public static Event getEvent(int index) {
        List<Event> events = (ArrayList) data.get(EVENT_KEY);
        if (events != null) {
            return events.get(index);
        }
        return null;
    }

    public static Student getStudent(int index) {
        List<Student> studentList = (ArrayList) data.get(STUDENT_KEY);
        if (studentList != null) {
            return studentList.get(index);
        }
        return null;
    }

    public static Event findByEventId(String id) {
        List<Event> events = (ArrayList) data.get(EVENT_KEY);
        if (events != null) {
            List<Event> tempList = events.stream().filter(event -> event.getId().equals(id)).collect(Collectors.toList());
            if (tempList != null && tempList.size() > 0) {
                return tempList.get(0);
            }

        }
        return null;
    }

    public static Appointment findByAppointmentId(String id) {
        List<Appointment> appointments = (ArrayList) data.get(APPOINTMENT_KEY);
        if (appointments != null) {
            List<Appointment> tempList = appointments.stream().filter(appointment -> appointment.getId().equals(id)).collect(Collectors.toList());
            if (tempList != null && tempList.size() > 0) {
                return tempList.get(0);
            }

        }
        return null;
    }

    public static Student findByStudentId(String id) {
        List<Student> studentList = (ArrayList) data.get(STUDENT_KEY);
        if (studentList != null) {
            List<Student> tempList = studentList.stream().filter(student -> student.getId().equals(id)).collect(Collectors.toList());
            if (tempList != null && tempList.size() > 0) {
                return tempList.get(0);
            }

        }
        return null;
    }

}
