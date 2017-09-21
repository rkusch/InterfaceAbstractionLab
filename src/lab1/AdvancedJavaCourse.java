package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * This class has prerequisites!
 *
 * @author Ryan Kusch
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course {


// added a setCoursePrerequisites becuase this course has prerequisites
    public AdvancedJavaCourse(String courseName, String courseNumber, String coursePrerequisites, double courseCredits) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCoursePrerequisites(coursePrerequisites);
        setCourseCredits(courseCredits);
    }

}
