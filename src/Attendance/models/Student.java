
package Attendance.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author bosun
 */


/***************************************************
****************************************************
       Student Model for tabulating Student Details
****************************************************
****************************************************/

public class Student {

    //Using JavaFx Bean Property Instance Variables
    private SimpleIntegerProperty ID = new SimpleIntegerProperty();
    private SimpleStringProperty fullName = new SimpleStringProperty("");
    private SimpleStringProperty matricNo = new SimpleStringProperty("");

    
    //Constructors
    public Student() {
        this("", "");
    }

    public Student(String fullName, String matricNo) {
        setFullName(fullName);
        setMatricNo(matricNo);

    }
    
    /******************************
    ******Getters and Setters******
    * *****************************/

    public void setId(Integer ID) {
        this.ID.set(ID);

    }

    public Integer getID() {
        return ID.get();
    }

    public void setFullName(String fullname) {
        fullName.set(fullname);
    }

    public String getFullName() {
        return fullName.get();
    }

    public void setMatricNo(String fname) {
        matricNo.set(fname);
    }

    public String getMatricNo() {
        return matricNo.get();
    }

    public IntegerProperty IDProperty() {
        if (ID == null) {
            ID = new SimpleIntegerProperty(this, "id");
        }
        return ID;

    }

    public StringProperty fullNameProperty() {
        if (fullName == null) {
            fullName = new SimpleStringProperty(this, "fullname");
        }
        return fullName;
    }

    public StringProperty matricNoProperty() {
        if (matricNo == null) {
            matricNo = new SimpleStringProperty(this, "matricno");
        }
        return matricNo;
    }

}
