
package Attendance.models;

/**
 *
 * @author bosun
 */



/*******************************************
********************************************
                 Course Model
********************************************
********************************************/
public class Course {

    private String courseTitle;
    private String courseCode;
    private int courseUnits;

    
    //Constructors
    public Course() {
    }

    public Course(String courseTitle, String courseCode, int courseUnits) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.courseUnits = courseUnits;
    }

    
    /******************************
    ******Getters and Setters******
    * *****************************/
    
    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCourseUnits() {
        return courseUnits;
    }

    public void setCourseUnits(int courseUnits) {
        this.courseUnits = courseUnits;
    }

    
    //toString method for test
    @Override
    public String toString() {
        return "Course{" + "courseTitle=" + courseTitle + ", courseCode=" + courseCode + ", courseUnits=" + courseUnits + '}';
    }

}
