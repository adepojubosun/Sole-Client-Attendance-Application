
package Attendance.operation;

import Attendance.models.AttendanceEntity;
import Attendance.models.CheckBoxEntity;
import Attendance.models.Lecturer;
import Attendance.models.Student;
import Attendance.persistence.*;
import static Attendance.persistence.AttendanceData.data;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.util.Callback;
import javafx.util.Duration;

/**
 * 
 *
 * @author bosun
 */
public class AttendanceOperation implements Initializable {
 
    /******************************
    ******GUI Variables******
    * *****************************/
    @FXML
    private Label courseCodeLabel;
    @FXML
    private TextField firstNameText;
    @FXML
    private TextField lastNametext;
    @FXML
    private TextField emailText;
    @FXML
    private TextField titleText;
    @FXML
    private Label detailsSavedLabel;
    private Lecturer lecturer;
    @FXML
    private TableView<Student> studentsTable;
    @FXML
    private TableView<CheckBoxEntity> attendanceTable;
    @FXML
    private TableView<AttendanceEntity> attendanceResultTable;
    @FXML
    private TableColumn<?, ?> daysPresentColumn;
    @FXML
    private TableColumn<?, ?> daysAbsentColumn;
    @FXML
    private TableColumn<?, ?> percentageAttendance;
    @FXML
    private TableColumn<Student, Integer> idColumn;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> matricColumn;

    
    private static int count = 0;
    private static boolean studentadded = false;
    private ObservableList<AttendanceEntity> attendanceData = FXCollections.observableArrayList();
    private EditStudentDialogOperation edit = new EditStudentDialogOperation() ;
    private Main application;
    
    
    /**
     * Method to Access GUI CLass From Main
     */
    public void setApp(Main app) {
        application = app;
    }
    
    
    /**
     * Initializes the User Interface.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        daysPresentColumn.setSortable(false);
        daysAbsentColumn.setSortable(false);
        percentageAttendance.setSortable(false);
        idColumn.setSortable(false);
        nameColumn.setSortable(false);
        matricColumn.setSortable(false);
        studentsTable.setEditable(true);
        attendanceTable.setEditable(true);
        attendanceTable.setItems(AttendanceData.data.getCheck());
        courseCodeLabel.setText(AttendanceData.getCode());
        studentsTable.setItems(AttendanceData.data.getStudentData());

        
     /**
     * Produce CheckBoxes in TableCell
     */
        switch (AttendanceData.getUnits()) {
            case 1:
            case 2:
                for (int i = 0; i < 24; i++) {
                    TableColumn<CheckBoxEntity, Boolean> myColumn = (TableColumn<CheckBoxEntity, Boolean>) attendanceTable.getColumns().get(i);
                    myColumn.setEditable(true);
                    myColumn.setPrefWidth(34.0);
                    myColumn.setMaxWidth(36.0);
                    myColumn.setCellFactory(new CheckBoxCellFactory<CheckBoxEntity, Boolean>());
                    myColumn.setSortable(false);
                }
                break;

            case 3:
                for (int i = 0; i < 32; i++) {
                    TableColumn<CheckBoxEntity, Boolean> myColumn = (TableColumn<CheckBoxEntity, Boolean>) attendanceTable.getColumns().get(i);
                    myColumn.setEditable(true);
                    myColumn.setPrefWidth(34.0);
                    myColumn.setMaxWidth(36.0);
                    myColumn.setCellFactory(new CheckBoxCellFactory<CheckBoxEntity, Boolean>());
                    myColumn.setSortable(false);
                }

                break;
        } 
    }

    
    /**
     * Add New Student Operation.
     */
    @FXML
    private void handleAddNewStudent(ActionEvent event) {
        Student tempStudent = new Student();
        //Call DialogBox From Main.
        boolean authenticate = application.showEditStudentDialog(tempStudent);
        if(authenticate){
            AttendanceData.data.getStudentData().add(tempStudent);//Add new Student to List
            ++count;//increment ID counter
            tempStudent.setId(count);
            studentadded = true;
             //generate CHeckBoxes in TableRow for New Student
            if (AttendanceData.getUnits() == 3) {
                AttendanceData.data.getCheck().add(new CheckBoxEntity(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false));
            } else {
                if (AttendanceData.getUnits() < 3 && AttendanceData.getUnits() > 0) {
                    AttendanceData.data.getCheck().add(new CheckBoxEntity(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false));
                }
            }
             
        }  
    }
    
    /**
     * Delete Student Operation.
     */
      @FXML
    private void handleDeleteStudent(ActionEvent event) {
        //get integer value of selected row.
        int selectedIndex = studentsTable.getSelectionModel().getSelectedIndex();
        if(studentadded){
            if(selectedIndex >=0){
                studentsTable.getItems().remove(selectedIndex);//remove item from table
                //AttendanceData.data.getStudentData().remove(selectedIndex);//remove item from list
                attendanceTable.getItems().remove(selectedIndex);//remove checkbox row from table
                --count; //decrement ID counter
            }else{
                
            }
        }else{
            
        }
    }
    
    

    /**
     * Edit Student Operation.
     */
    @FXML
    private void handleEditStudent(ActionEvent event) {
        //get integer value of selected row.
        Student selectedStudent = studentsTable.getSelectionModel().getSelectedItem();
        if(studentadded){
		if (selectedStudent != null) {
			boolean Clicked = application.showEditStudentDialog(selectedStudent);//Call DialogBox From Main.
			if (Clicked) {
				edit.showStudentDetails(selectedStudent);//Load Student Details
			}

		} else {
                    System.out.println("error");
                	}
    }else{
            System.out.println("error");
        }

    }

    
    /**
     * Calculate Attendance Operation.
     */
    @FXML
    private void handleCalculateAll(ActionEvent event) {
        ObservableList<CheckBoxEntity> checkBoxes;//Temporary CheckBox list

        checkBoxes = attendanceTable.getItems();//populate list with Checkbox items(and boolean values) from table
        attendanceData.clear();//refresh values
        //Loop Values from CheckBoxEntity Calculate days present, days absent, and percentage methods
        for (int i = 0; i < data.getStudentData().size(); i++) {
            int dp = checkBoxes.get(i).calculateDP();
            int da = checkBoxes.get(i).calculateDA();
            float p = checkBoxes.get(i).calculatePercentage();

            attendanceData.add(new AttendanceEntity(dp, da, p));//Add values into list
        }
        attendanceResultTable.setItems(attendanceData);//Add List to Table

    }

    
    /**
     * Save Lecturer Details to File
     */
    @FXML
    private void handleSaveDetails(ActionEvent event) {
        //get values from fields
        if (!titleText.getText().isEmpty() && !firstNameText.getText().isEmpty()
                && !lastNametext.getText().isEmpty() && !emailText.getText().isEmpty()) {
            lecturer = new Lecturer(titleText.getText(), firstNameText.getText(),
                    lastNametext.getText(), emailText.getText());
            AttendanceData.data.setLecturer(lecturer);//Add values to List
            setDetailsSavedMessage();
            titleText.setText("");
            firstNameText.setText("");
            lastNametext.setText("");
            emailText.setText("");

        } else {
            detailsSavedLabel.setText("Invalid Details");
        }

    }

    private void setDetailsSavedMessage() {
        detailsSavedLabel.setText("DETAILS SAVED");
        FadeTransition ft = new FadeTransition(Duration.millis(1000), detailsSavedLabel);
        ft.setFromValue(0.0);
        ft.setToValue(1);
        ft.play();
    }

    
    /**
     * Log Out Operation
     */
    @FXML
    private void handleLogOut(ActionEvent event) {
        application.gotoLogin();
    }
    
    
    
  /**
     * JAVAFX Table CellFactory for CheckBoxes
     */
 private class CheckBoxCellFactory<S, T> implements Callback<TableColumn<S, T>, TableCell<S, T>> {

        @Override
        public TableCell<S, T> call(TableColumn<S, T> p) {
            return new CheckBoxTableCell();

        }
    }

}
