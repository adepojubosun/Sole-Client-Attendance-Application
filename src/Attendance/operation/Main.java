
package Attendance.operation;

import Attendance.UI.FXMLScenes;
import Attendance.models.Student;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * GUI Loader Class
 * @author bosun
 */
public class Main extends Application {

    Stage stage;

    
    
    /**
     * Start Method for GUI
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setTitle("ATTENDANCE APPLICATION");
        this.stage.getIcons().add(new Image("file:/../Attendance.Fxml/logoIconOnly210.png"));//Change Icon
        stage.setResizable(true);
        stage.centerOnScreen();
        gotoLogin();
        stage.show();
    }

    /**
     * @param args the command line arguments
     * Launches in JVM
     */
    public static void main(String[] args) {
        launch();
    }

    /**
     * Login Stage
     */
    public void gotoLogin() {
        try {
            // Load the fxml file and create a new stage 
            LoginOperation page = (LoginOperation) replaceSceneContent("login.fxml");
            stage.centerOnScreen(); 
            stage.setResizable(false);
            page.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    /**
     * Add New Course Stage
     */
    public void gotoChangeCourse() {
        try {
            // Load the fxml file and create a new stage
            ChangeCourseOperation page = (ChangeCourseOperation) replaceSceneContent("changeCourse.fxml");
            stage.setResizable(false);
            page.setApp(this);
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    /**
     * Change PassWord Stage
     */
    public void gotoChangePassword() {
        try {
            // Load the fxml file and create a new stage.
            ChangePasswordOperation page = (ChangePasswordOperation) replaceSceneContent("changePassword.fxml");
            stage.setResizable(false);
            page.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    /**
     * Attendance Application stage
     */
    public void gotoMainAPP() {
        try {
            // Load the fxml file and create a new stage.
            AttendanceOperation page = (AttendanceOperation) replaceSceneContent("mainAPP.fxml");
            stage.centerOnScreen();
            //stage.setFullScreen(true);
            page.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    /**
     * Student Dialog Stage
     */
    public boolean showEditStudentDialog(Student student) {
		try {
			// Load the fxml file and create a new stage for the popup dialog.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(FXMLScenes.class.getResource("EditStudentDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
                        

			// Create the dialog Stage.
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Student");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(stage);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			// Set the Student into the controller.
			EditStudentDialogOperation controller = loader.getController();
			controller.setDialogStage(dialogStage);
			controller.setStudent(student);

			// Show the dialog and wait until the user closes it
			dialogStage.showAndWait();

			return controller.buttonClicked();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
    
    
    
    //Load all FXML Files
    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = FXMLScenes.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(FXMLScenes.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
}
