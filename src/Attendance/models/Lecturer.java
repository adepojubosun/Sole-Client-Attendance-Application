
package Attendance.models;

/**
 *
 * @author bosun
 */


/*******************************************
********************************************
     (Sole) Lecturer Model (Client)
********************************************
********************************************/
public class Lecturer {

    private String title;
    private String firstName;
    private String lastName;
    private String email;

    
    //Constructors
    public Lecturer() {

    }

    public Lecturer(String title, String firstName, String lastName, String email) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    
    
    
    /******************************
    ******Getters and Setters******
    * *****************************/
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
     //toString method 
    @Override
    public String toString() {
        return "Lecturer{" + "title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }

}
