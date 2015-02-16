/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendance.operation;

import Attendance.models.Student;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * 
 *
 * @author bosun
 */
public class EditStudentDialogOperation implements Initializable {
    
    
    /******************************
    ******GUI Variables******
    ******************************/
    @FXML
    private TextField nameText;
    @FXML
    private TextField matricNumberText;
    @FXML
    private Label errorLabel;
    
    
    private Stage dialogStage;//Create New Stage interface for dialog
    private Student student ;
    private boolean clicked = false;

    /**
     * Initializes the User Interface.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        errorLabel.setText("");
        student = new Student();
    }    
    
    //Setters for Student And Stage Objects
    public void setDialogStage(Stage dialogStage){
        this.dialogStage = dialogStage;
    }

    public void setStudent(Student student){
        this.student = student;
        nameText.setText(student.getFullName());
        matricNumberText.setText(student.getMatricNo());
    }
    
    //Authenticator
    public boolean buttonClicked(){
        return clicked;
    }
    
    
    public void showStudentDetails(Student student){  
    if (student != null) {
    		// Fill the labels with info from the Student object.
    		nameText.setText(student.getFullName());
    		matricNumberText.setText(student.getMatricNo());
    		
    	} else {
    		// Student is null, remove all the text.
    		nameText.setText("");
    		matricNumberText.setText("");
    	}
    }
    
    
    /**
     * Save Operation
     */
    @FXML
    private void handleSave(ActionEvent event) {
        //get values from fields
        if (!nameText.getText().isEmpty()
                && !matricNumberText.getText().isEmpty()) {
            student.setFullName(nameText.getText());
            student.setMatricNo(matricNumberText.getText());
            clicked = true;
            dialogStage.close();//close stage
        } else {
            errorLabel.setText("Incomplete Field");
        }

    }
    

    /**
     * Cancel Operation
     */
    @FXML
    private void handleCancel(ActionEvent event) {
        dialogStage.close();
    }
    
}
