package com.example.saulolab10day10;

public class GradeEvaluator {

    /**
     * Evaluates the performance of a student based on their average grade.
     * 
     * @param student the student whose performance is being evaluated
     * @return true if the student's average grade is 60 or above, false otherwise
     */
    public boolean evaluatePerformance(Student student) {
        double averageGrade = student.calculateAverage();
        return averageGrade >= 60;
    }

    /**
     * Checks if a student is eligible for honors based on their average grade.
     * 
     * @param student the student being checked for honors eligibility
     * @return true if the student's average grade is 90 or above, false otherwise
     */
    public boolean isEligibleForHonors(Student student) {
        double averageGrade = student.calculateAverage();
        return averageGrade >= 90;
    }
}