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

    @Override
    public void setCoursePrerequisites(String coursePrerequisites) {
        if (coursePrerequisites == null) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
        }
        super.setCoursePrerequisites(coursePrerequisites);
    }

    public AdvancedJavaCourse(String courseName, String courseNumber, String coursePrerequisites, double courseCredits) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCoursePrerequisites(coursePrerequisites);
        setCourseCredits(courseCredits);
    }

}
