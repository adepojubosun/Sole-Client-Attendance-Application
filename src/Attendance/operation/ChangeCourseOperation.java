
package Attendance.operation;

import Attendance.models.Course;
import Attendance.persistence.AttendanceData;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

/**
 * 
 *
 * @author bosun
 */
public class ChangeCourseOperation implements Initializable {

    /******************************
    ******GUI Variables******
    * *****************************/
    @FXML
    private TextField courseTitleText;
    @FXML
    private TextField courseCodeText;
    @FXML
    private TextField courseUnitsText;
    @FXML
    private Button addCourse;
    @FXML
    private Label addNewCourseLabel;

    
    private Course course;
    private int courseUnits = -1;
    private Main application;

    
    
    /**
     * Method to Access GUI Class From Main
     */
    public void setApp(Main app) {
        application = app;
    }
    
    
    
    /**
     * Initializes the User Interface.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addNewCourseLabel.setText("");
    }

    
    
    /**
     * Add Course Operation
     */
    @FXML
    private void handleAddCourse(ActionEvent event) {
        //get values from fields
        if (!courseTitleText.getText().isEmpty() && courseTitleText.getText() != null
                && courseTitleText.getText().contains("")) {
            if (!courseCodeText.getText().isEmpty() && courseCodeText.getText() != null
                    && courseCodeText.getText().contains("")) {
                try {
                    courseUnits = Integer.parseInt(courseUnitsText.getText());
                } catch (NumberFormatException Exception) {
                    addNewCourseLabel.setText("Course Unit must be an Integer");
                } finally {
                    if (!courseUnitsText.getText().isEmpty() && courseUnitsText.getText() != null
                            && courseUnitsText.getText().contains("") && courseUnits != -1 && courseUnits<=3) {
                        course = new Course(courseTitleText.getText(), courseCodeText.getText(), courseUnits);//Create Course Object
                        AttendanceData.data.addCourse(course);//Add Values to List
                        AttendanceData.setUnits(courseUnits);//Set Units
                        setCourseAddedMessage();
                        courseCodeText.setText("");
                        courseUnitsText.setText("");
                        courseTitleText.setText("");

                    } else {

                        courseUnitsText.setText("");

                        addNewCourseLabel.setText("Invalid Course Unit");
                    }
                }
            } else {
                courseCodeText.setText("");

                addNewCourseLabel.setText("Invalid Course Code");
            }

        } else {

            courseTitleText.setText("");
            addNewCourseLabel.setText("Invalid Course Title");
        }

    }
    
    

    /**
     * GO Back Operation
     */
    @FXML
    private void handleBack(ActionEvent event) {
        application.gotoLogin();
    }

    private void setCourseAddedMessage() {
        addNewCourseLabel.setText("COURSE ADDED");
        FadeTransition ft = new FadeTransition(Duration.millis(1000), addNewCourseLabel);
        ft.setFromValue(0.0);
        ft.setToValue(1);
        ft.play();

    }
}
