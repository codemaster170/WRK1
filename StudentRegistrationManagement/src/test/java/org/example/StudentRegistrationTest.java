package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRegistrationTest {

    @org.junit.jupiter.api.Test

    public void StudentRegistration() {

  @BeforeAll
    public static void setUp() {
        System.setProperty("java.awt.headless", "true");
    }


        StudentRegistration registration = new StudentRegistration();

        assertNotNull(registration.nameField);
        assertNotNull(registration.regField);
        assertNotNull(registration.courseField);
        assertNotNull(registration.subjectField);
        assertNotNull(registration.maleButton);
        assertNotNull(registration.femaleButton);
        assertNotNull(registration.dateChooser);
        assertNotNull(registration.studentComboBox);
    }
    @Test
    public void ResetFormFields() {
        StudentRegistration registration = new StudentRegistration();
        // Verify that the resetFormFields method resets the form fields correctly
        registration.nameField.setText("Halimo");
        registration.regField.setText("123456/BIT");
        registration.courseField.setText("Computer Science");
        registration.subjectField.setText("Mathematics");
        registration.maleButton.setSelected(true);
        registration.dateChooser.setDate(java.util.Date.from(java.time.Instant.now()));

        assertDoesNotThrow(registration::resetFormFields);

        assertEquals("", registration.nameField.getText());
        assertEquals("", registration.regField.getText());
        assertEquals("", registration.courseField.getText());
        assertEquals("", registration.subjectField.getText());
        assertTrue(registration.maleButton.isSelected());
        assertNull(registration.dateChooser.getDate());
    }
    @Test
    public void testGetManager() {
        StudentRegistration registration = new StudentRegistration();
        // Verify that the getManager method returns the correct manager instance
        assertNotNull(registration.getManager());
        assertInstanceOf(StudentRegistration.StudentManager.class, registration.getManager());
    }
    @Test
    public void testActionListeners() {
        StudentRegistration registration = new StudentRegistration();
        // Verify that the action listeners are added to the GUI components correctly
        assertNotNull(registration.nameField.getActionListeners());
        assertNotNull(registration.regField.getActionListeners());
        assertNotNull(registration.courseField.getActionListeners());
        assertNotNull(registration.subjectField.getActionListeners());
        assertNotNull(registration.maleButton.getActionListeners());
        assertNotNull(registration.femaleButton.getActionListeners());
        assertNotNull(registration.studentComboBox.getActionListeners());
    }
    @Test
    public void testStudentRegistrationOutput() {

        StudentRegistration registration = new StudentRegistration();

        registration.nameField.setText("Farah");
        registration.regField.setText("123456/BIT");
        registration.courseField.setText("Computer Science");
        registration.subjectField.setText("Mathematics");
        registration.maleButton.setSelected(true);

        registration.dateChooser.setDate(java.util.Date.from(java.time.Instant.now()));


        String expectedOutput = "Name: Farah\nRegistration No: 123456/BIT\nCourse: Computer Science\nSubject: Mathematics\nGender: Male\nDate of Birth: " + registration.dateChooser.getDate().toString();


        String actualOutput = "Name: " + registration.nameField.getText() + "\n" +
                "Registration No: " + registration.regField.getText() + "\n" +
                "Course: " + registration.courseField.getText() + "\n" +
                "Subject: " + registration.subjectField.getText() + "\n" +
                "Gender: " + (registration.maleButton.isSelected() ? "Male" : "Female") + "\n" +
                "Date of Birth: " + registration.dateChooser.getDate().toString();

        assertLinesMatch(expectedOutput.lines(), actualOutput.lines());
    }


}

