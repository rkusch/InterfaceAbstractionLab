/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author rkusch
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double courseCredits;
    private String coursePrerequisites;

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");
        }
        this.courseName = courseName;
    }


    public final String getCourseNumber() {
        return courseNumber;
    }

      public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        this.courseNumber = courseNumber;
    }

    public final double getCourseCredits() {
        return courseCredits;
    }

       public final void setCourseCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.courseCredits = credits;
    }

    public final String getCoursePrerequisites() {
        return coursePrerequisites;
    }

    public final void setCoursePrerequisites(String prerequisites) {
        if (prerequisites == null) {
            this.coursePrerequisites="No Prerequisites";
        }
    }
    }
    

