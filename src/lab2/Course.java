/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author kusch
 */
public interface Course {

    public String getCourseName();

    public void setCourseName(String courseName);

    public String getCourseNumber();

    public void setCourseNumber(String courseNumber);

    public double getCourseCredits();

    public void setCourseCredits(double credits);

    public String getCoursePrerequisites();

    public void setCoursePrerequisites(String prerequisites);

}
