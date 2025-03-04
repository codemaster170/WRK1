package org.example;

import org.junit.jupiter.api.Test;


import java.sql.Date;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class StudentManagerTest {

    @org.junit.jupiter.api.Test
    public void AddStudent() {
        StudentManager manager = new StudentManager();

        manager.addStudent("Abdulle", "123456", "Male", "Computer Science", "Mathematics", Date.valueOf("1990-01-01"));

        assertEquals(1, manager.getStudents().size());
    }
    @Test
    public void RemoveStudent() {
        StudentManager manager = new StudentManager();

        manager.addStudent("Abdulle", "123456BSCE", "Male", "Computer Science", "Mathematics", Date.valueOf("1990-01-01"));

        manager.removeStudent();

        assertEquals(1, manager.getStudents().size());
    }
    @Test
    public void GetNextStudent() {
        StudentManager manager = new StudentManager();

        manager.addStudent("Abdulle", "252123456/BIT", "Male", "Computer Science", "Mathematics", Date.valueOf("1990-01-01"));

        Student nextStudent = manager.getNextStudent();
        assertEquals("Abdulle", nextStudent.name);
    }
    @Test
    public void GetPreviousStudent() {
        StudentManager manager = new StudentManager();

        manager.addStudent("Yasin", "252123456/BSSC", "Male", "Computer Science", "Mathematics", Date.valueOf("1990-01-01"));
        manager.getNextStudent();

        Student previousStudent = manager.getPreviousStudent();
        assertEquals("Yasin", previousStudent.name);
    }
    @Test
    public void GetAllStudents() {
        StudentManager manager = new StudentManager();

        manager.addStudent("Yasin", "252123456/BBBS", "Male", "Computer Science", "Mathematics", Date.valueOf("1990-01-01"));

        ArrayList<Student> allStudents = manager.getAllStudents();

        assertEquals(1, allStudents.size());
    }

}
