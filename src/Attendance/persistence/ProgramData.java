
package Attendance.persistence;

import Attendance.models.Account;
import Attendance.models.CheckBoxEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Attendance.models.Course;
import Attendance.models.Lecturer;
import Attendance.models.Student;

/**
 *
 * @author Bosun
 */


/*******************************************
********************************************
       Predefined Persistence Class
********************************************
********************************************/
public class ProgramData {

    private ObservableList<Student> studentData = FXCollections.observableArrayList();
    private ObservableList<Course> courseData = FXCollections.observableArrayList();
    private ObservableList<CheckBoxEntity> check = FXCollections.observableArrayList();
    private Lecturer lecturer;
    private Account account;

    
    //Constructor
    public ProgramData() {
        ///////////////////////////////////////////////////////////////////////
        /////////////////////////Test Objects//////////////////////////////////
        ///////////////////////////////////////////////////////////////////////
        /*********************************************************************/
        /*studentData.add(new Student("Jacob Smith" ,"RUN/CMP/12/4644"));
        studentData.add(new Student("Isabella Johnson","RUN/CMP/12/4644"));
        studentData.add(new Student("Ethan Williams" ,"RUN/CMP/12/4623"));
        studentData.add(new Student("Emma Jones", "RUN/CMP/12/4643"));
        studentData.add(new Student("Michael Brown" ,"RUN/CMP/12/4654"));
        studentData.add(new Student("John Cusack","RUN/CMP/12/4656" ));
        studentData.add(new Student("Adebayo sheriff" ,"RUN/CMP/12/4687" ));
        studentData.add(new Student("Samuel Jackson","RUN/CMP/12/4698"));
        studentData.add(new Student("Eden Hunt" ,"RUN/CMP/12/4609"));
        studentData.add(new Student("Michael Carrick","RUN/CMP/12/4612"));
        studentData.add(new Student("David West","RUN/CMP/12/4600"));
        studentData.add(new Student("Paul George" ,"RUN/CMP/12/4666"));
        studentData.add(new Student("Mark Twain" ,"RUN/CMP/12/4634"));
        studentData.add(new Student("Roy Hibbbert", "RUN/CMP/12/4601"));
        studentData.add(new Student("Steph Curry" ,"RUN/CMP/12/4615"));
        studentData.add(new Student("Paul Smith" ,"RUN/CMP/12/4635" ));
        studentData.add(new Student("David Stan", "RUN/CMP/12/8532"));
        studentData.add(new Student("Deborah Lewis", "RUN/CMP/12/4633"));*/
        /*courseData.add(new Course("Database Systems I", "CMP 343", 3));
        courseData.add(new Course("Mathematical Modelling", "MAT 317", 3));*/
        /*********************************************************************/
        account = new Account(" ");//Default Password
        //Create CHeckboxEntity Objects
        for (int i = 0; i < studentData.size(); i++) {
            if (AttendanceData.getUnits() == 3) {
                check.add(new CheckBoxEntity(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false));
            } else {
                if (AttendanceData.getUnits() < 3 && AttendanceData.getUnits() > 0) {
                    check.add(new CheckBoxEntity(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false));
                }
            }

        }

    }
    
    
     /******************************
    ******Getters and Setters******
    ******************************/
    public ObservableList<Student> getStudentData() {
        return studentData;
    }

    public ObservableList<Course> getCourseData() {
        return courseData;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public ObservableList<CheckBoxEntity> getCheck() {

        return check;
    }

    public void addCourse(Course course) {
        courseData.add(course);
    }
    

    

}
