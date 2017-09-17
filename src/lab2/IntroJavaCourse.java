package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double courseCredits;
    private String coursePrerequisites;


    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");
        }
        this.courseName = courseName;
    }


    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
      public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCourseCredits() {
        return courseCredits;
    }

    @Override
       public void setCourseCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.courseCredits = credits;
    }

    @Override
    public String getCoursePrerequisites() {
        return coursePrerequisites;
    }

    @Override
    public void setCoursePrerequisites(String prerequisites) {
        this.coursePrerequisites = prerequisites;
    }
    
          public IntroJavaCourse(String courseName, String courseNumber, double courseCredits) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCourseCredits(courseCredits);
    }
}
