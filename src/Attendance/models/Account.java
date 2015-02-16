
package Attendance.models;

/**
 *
 * @author bosun
 */
/*******************************************
********************************************
     Account Model for Sole Lecturer(Client)
********************************************
********************************************/
public class Account {

    private String password;
    
    //Constructors
    public Account(String password) {
        this.password = password;
    }

    public Account() {
    }

    /******************************
    ******Getters and Setters******
    * *****************************/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
