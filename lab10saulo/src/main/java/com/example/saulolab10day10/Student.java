package com.example.saulolab10day10;

import java.util.List;

public class Student {
    private String name;
    private String studentID;
    private List<Integer> grades;

    /**
     * Constructor to initialize a Student object.
     * 
     * @param name      the name of the student
     * @param studentID the unique identifier for the student
     * @param grades    the list of grades the student has received
     */
    public Student(String name, String studentID, List<Integer> grades) {
        this.name = name;
        this.studentID = studentID;
        this.grades = grades;
    }

    /**
     * Gets the name of the student.
     * 
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     * 
     * @param name the new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the student ID.
     * 
     * @return the student ID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * Sets the student ID.
     * 
     * @param studentID the new student ID
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Gets the list of grades.
     * 
     * @return the list of grades
     */
    public List<Integer> getGrades() {
        return grades;
    }

    /**
     * Sets the list of grades.
     * 
     * @param grades the new list of grades
     */
    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    /**
     * Calculates the average of the grades.
     * 
     * @return the average grade, or 0 if there are no grades
     */
    public double calculateAverage() {
        if (grades == null || grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}