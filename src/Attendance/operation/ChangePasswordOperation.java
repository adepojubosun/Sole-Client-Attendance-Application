/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendance.operation;

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
import javafx.scene.paint.Paint;
import javafx.util.Duration;

/**
 * 
 *
 * @author bosun
 */
public class ChangePasswordOperation implements Initializable {

    /******************************
    ******GUI Variables******
    * *****************************/
    @FXML
    private Button changePassword;
    @FXML
    private Button backButton;
    @FXML
    private TextField setOldPassword;
    @FXML
    private TextField setNewPassword;
    @FXML
    private TextField setRepeatPassword;
    @FXML
    private Label passwordChangedLabel;

    private Main application;
    
    //Method to Access GUI Class From Main
    public void setApp(Main app) {
        application = app;
    }
    
    
    
    /**
     * Initializes the User Interface.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        passwordChangedLabel.setText("");
    }
    

   

    /**
     * Change Password Operation.
     */
    @FXML
    private void handleChangePassword(ActionEvent event) {
        //get values from fields
        if (!setOldPassword.getText().isEmpty()
                && setOldPassword.getText().equals(AttendanceData.data.getAccount().getPassword())) {
            if (setNewPassword.getText().equals(setRepeatPassword.getText())
                    && !setNewPassword.getText().isEmpty() && !setRepeatPassword.getText().isEmpty()) {
                AttendanceData.data.getAccount().setPassword(setNewPassword.getText());//Add Value to List
                setPasswordChangedMessage();
                setNewPassword.setText("");
                setOldPassword.setText("");
                setRepeatPassword.setText("");
            } else {
                setNewPassword.setText("");
                setRepeatPassword.setText("");
                passwordChangedLabel.setText("Fields Do not Match");
            }
        } else {
            setNewPassword.setText("");
            setOldPassword.setText("");
            setRepeatPassword.setText("");
            passwordChangedLabel.setText("Password Invalid");
        }

    }

    private void setPasswordChangedMessage() {
        passwordChangedLabel.setText("PASSWORD CHANGED");
        FadeTransition ft = new FadeTransition(Duration.millis(1000), passwordChangedLabel);
        ft.setFromValue(0.0);
        ft.setToValue(1);
        ft.play();

    }

    /**
     * GO Back Operation
     */
    @FXML
    private void handleBack(ActionEvent event) {
        application.gotoLogin();
    }

}
