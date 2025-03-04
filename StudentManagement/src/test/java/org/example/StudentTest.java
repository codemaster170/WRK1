package org.example;

import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void Student() {
        // Create a new Student object
        Student student = new Student("Geedi", "2123456", "Computer Science", "Mathematics", "Male", Date.valueOf("1990-01-01"));

        // Verify that the object was created correctly
        assertEquals("Geedi", student.getName());
        assertEquals("2123456", student.getRegNo());
        assertEquals("Computer Science", student.getCourse());
        assertEquals("Mathematics", student.getSubject());
        assertEquals("Male", student.getGender());
        assertEquals(Date.valueOf("1990-01-01"), student.getDob());

        assertInstanceOf(Student.class, student);
    }
    @Test
    public void testToString() {
        // Create a new Student object
        Student student = new Student("Warfaa", "123456", "Computer Science", "Mathematics", "Male", Date.valueOf("1990-01-01"));

        // Verify that the toString method returns the expected string
        String expectedString = "Name: Warfaa, Reg No: 123456, Course: Computer Science, Subject: Mathematics, Gender: Male, DOB: 1990-01-01";
        assertEquals(expectedString, student.toString());
    }

    @Test
    public void testGetters() {
        // Create a new Student object
        Student student = new Student("Jama", "123456", "Computer Science", "Mathematics", "Male", Date.valueOf("1990-01-01"));

        // Verify that the getter methods return the expected values
        assertEquals("Jama", student.getName());
        assertEquals("123456", student.getRegNo());
        assertEquals("Computer Science", student.getCourse());
        assertEquals("Mathematics", student.getSubject());
        assertEquals("Male", student.getGender());
        assertEquals(Date.valueOf("1990-01-01"), student.getDob());
}


}


