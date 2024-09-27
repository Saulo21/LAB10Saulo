import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.saulolab10day10.Student;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

        private Student student;

        @BeforeEach
        public void setUp() {
            List<Integer> grades = Arrays.asList(90, 80, 70);
            student = new Student("John Doe", "12345", grades);
        }

        @Test
        public void testGetName() {
            assertEquals("John Doe", student.getName());
        }

        @Test
        public void testSetName() {
            student.setName("Jane Doe");
            assertEquals("Jane Doe", student.getName());
        }

        @Test
        public void testGetStudentID() {
            assertEquals("12345", student.getStudentID());
        }

        @Test
        public void testSetStudentID() {
            student.setStudentID("54321");
            assertEquals("54321", student.getStudentID());
        }

        @Test
        public void testGetGrades() {
            List<Integer> expectedGrades = Arrays.asList(90, 80, 70);
            assertEquals(expectedGrades, student.getGrades());
        }

        @Test
        public void testSetGrades() {
            List<Integer> newGrades = Arrays.asList(100, 95, 85);
            student.setGrades(newGrades);
            assertEquals(newGrades, student.getGrades());
        }

        @Test
        public void testCalculateAverage() {
            assertEquals(80.0, student.calculateAverage());
        }

        @Test
        public void testCalculateAverageNoGrades() {
            student.setGrades(Arrays.asList());
            assertEquals(0.0, student.calculateAverage());
        }

        @Test
        public void testCalculateAverageNullGrades() {
            student.setGrades(null);
            assertEquals(0.0, student.calculateAverage());
        }
}
