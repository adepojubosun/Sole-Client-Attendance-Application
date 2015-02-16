
package Attendance.operation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import Attendance.persistence.AttendanceData;
import javafx.scene.control.Label;

/**
 *
 *
 * @author bosun
 */
public class LoginOperation extends AnchorPane implements Initializable {
    /******************************
    ******GUI Variables******
    ******************************/
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private ComboBox<String> selectCourse;
    @FXML
    private Label wrongPasswordLabel;
    
    
    private Main application;
    private static ObservableList<String> courseCode = FXCollections.observableArrayList();
    
    
    
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
        wrongPasswordLabel.setText("");
        courseCode.clear();//clear List
        for (int i = 0; i < AttendanceData.data.getCourseData().size(); i++) {
            courseCode.add(AttendanceData.data.getCourseData().get(i).getCourseCode());
        }
        selectCourse.setItems(courseCode); //Add ListValues to DropDown

    }

    

    
    /**
     * Add Course Operation
     */
    @FXML
    private void handleAdd(ActionEvent event) {
        application.gotoChangeCourse();//Call ChangeCourse Stage
    }

    
    /**
     * Change PassWord Operation
     */
    @FXML
    private void handleChangePassword(ActionEvent event) {
        application.gotoChangePassword();//Call ChangePassword Stage
    }

    
    /**
     * Login Operation
     */
    @FXML
    private void handleLogin(ActionEvent event) {
        //get values from fields
        //Authenticate Login
        if (AttendanceData.data.getAccount().getPassword().equals(passwordTextField.getText())
                && !passwordTextField.getText().isEmpty() && passwordTextField.getText() != null) {
            if (selectCourse.getValue() != null) {
                AttendanceData.setCode(selectCourse.getValue());
                passwordTextField.setText("");
                application.gotoMainAPP();//Open Main Application

            } else {
                wrongPasswordLabel.setText("Select a Course");
            }

        } else {
            passwordTextField.setText("");
            wrongPasswordLabel.setText("Invalid Password");
        }

    }



}
