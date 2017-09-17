/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author rkusch
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double courseCredits;
    private String coursePrerequisites;

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }


    public String getCourseNumber() {
        return courseNumber;
    }

      public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        this.courseNumber = courseNumber;
    }

    public double getCourseCredits() {
        return courseCredits;
    }

       public void setCourseCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.courseCredits = credits;
    }

    public String getCoursePrerequisites() {
        return coursePrerequisites;
    }

    public void setCoursePrerequisites(String prerequisites) {
        this.coursePrerequisites = prerequisites;
    }
    
    
    
}
