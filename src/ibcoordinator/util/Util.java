/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibcoordinator.util;

import ibcoordinator.data.Appointment;
import ibcoordinator.data.Event;
import ibcoordinator.data.Student;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author AnishMalyala
 */
public class Util {

    private static final String regex = "^(.+)@(.+)$";
    private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private static Pattern pattern = Pattern.compile(regex);

    static {
        df.setLenient(false);
    }

    public static void showWindow(JFrame jcontainer, JFrame parentContainer) {
        jcontainer.setVisible(true);
        parentContainer.setVisible(false);
    }

    public static boolean isValidEmail(String emailAddress) {
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }

    public static boolean isValidDate(String date) {
        try {
            df.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean isValidDate1(String date) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        f.withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate ld = LocalDate.parse(date, f);
            System.out.println("ld: " + ld);
        } catch (DateTimeParseException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
        return true;
    }

    public static String validateStudent(Student student) {
        if (student.getName().length() < 1) {
            return "Invalid Student Name";
        }

        if (!isValidDate1(student.getDateOfBirth())) {
            return "Invalid Date of Birth";
        }

        if (student.getClassDetails().length() < 1) {
            return "Invalid Class Details";
        }

        if (student.getCurriculum().length() < 1) {
            return "Invalid Curriculum Details";
        }

        if (!isValidEmail(student.getEmailAddress())) {
            return "Invalid Email Address";
        }

        return "OK";
    }

    public static String validateAppointment(Appointment appointment) {
        if (appointment.getType().length() < 1) {
            return "Invalid Appointment Type";
        }

        if (!isValidDate1(appointment.getMeetingDate())) {
            return "Invalid Meeting Date";
        }

        if (appointment.getSubject().length() < 1) {
            return "Invalid Subject Details";
        }

        if (appointment.getStudent() == null) {
            return "Invalid Student Details";
        }

        return "OK";
    }

    public static String validateEvent(Event event) {
        if (event.getType().length() < 1) {
            return "Invalid Title Type";
        }

        if (!isValidDate1(event.getDate())) {
            return "Invalid Event Date";
        }

        if (event.getTitle().length() < 1) {
            return "Invalid Title Details";
        }

        if (event.getCoordinator().length() < 1) {
            return "Invalid Co Ordinator Details";
        }

        return "OK";
    }

}
