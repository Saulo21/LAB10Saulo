import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.saulolab10day10.GradeEvaluator;
import com.example.saulolab10day10.Student;

public class GradeEvaluatorTest {

    private GradeEvaluator gradeEvaluator;

    @Mock
    private Student student;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        gradeEvaluator = new GradeEvaluator();
    }

    @Test
    public void testEvaluatePerformance_Pass() {
        when(student.calculateAverage()).thenReturn(75.0);
        assertTrue(gradeEvaluator.evaluatePerformance(student));
    }

    @Test
    public void testEvaluatePerformance_Fail() {
        when(student.calculateAverage()).thenReturn(55.0);
        assertFalse(gradeEvaluator.evaluatePerformance(student));
    }

    @Test
    public void testIsEligibleForHonors_Eligible() {
        when(student.calculateAverage()).thenReturn(95.0);
        assertTrue(gradeEvaluator.isEligibleForHonors(student));
    }

    @Test
    public void testIsEligibleForHonors_NotEligible() {
        when(student.calculateAverage()).thenReturn(85.0);
        assertFalse(gradeEvaluator.isEligibleForHonors(student));
    }

    // Additional test cases for edge scenarios

    @Test
    public void testEvaluatePerformance_NoGrades() {
        when(student.calculateAverage()).thenReturn(0.0);
        assertFalse(gradeEvaluator.evaluatePerformance(student));
    }

    @Test
    public void testEvaluatePerformance_OneGrade() {
        when(student.calculateAverage()).thenReturn(60.0);
        assertTrue(gradeEvaluator.evaluatePerformance(student));
    }

    @Test
    public void testIsEligibleForHonors_Borderline() {
        when(student.calculateAverage()).thenReturn(89.0);
        assertFalse(gradeEvaluator.isEligibleForHonors(student));
    }

    @Test
    public void testEvaluatePerformance_Borderline() {
        when(student.calculateAverage()).thenReturn(59.9);
        assertFalse(gradeEvaluator.evaluatePerformance(student));
    }

    @Test
    public void testEvaluatePerformance_ExactPass() {
        when(student.calculateAverage()).thenReturn(60.0);
        assertTrue(gradeEvaluator.evaluatePerformance(student));
    }

    @Test
    public void testIsEligibleForHonors_ExactHonors() {
        when(student.calculateAverage()).thenReturn(90.0);
        assertTrue(gradeEvaluator.isEligibleForHonors(student));
    }
}