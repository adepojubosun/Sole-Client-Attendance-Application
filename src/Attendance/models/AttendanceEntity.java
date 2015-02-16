
package Attendance.models;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author bosun
 */


/**************************************************************
***************************************************************
       AttendanceEntity Model for tabulating Attendance Details
***************************************************************
***************************************************************/

public class AttendanceEntity {

    //Using JavaFx Bean Property Instance Variables
    private IntegerProperty DP = new SimpleIntegerProperty();
    private IntegerProperty DA = new SimpleIntegerProperty();
    private FloatProperty percent = new SimpleFloatProperty();

    //Constructor
    public AttendanceEntity(int DP, int DA, float percent) {
        setDA(DA);
        setDP(DP);
        setPercent(percent);
    }

    /******************************
    ******Getters and Setters******
    * *****************************/
    public Integer getDP() {
        return DP.get();
    }

    public void setDP(Integer DP) {
        this.DP.set(DP);
    }

    public IntegerProperty DPProperty() {
        return DP;
    }

    public Integer getDA() {
        return DA.get();
    }

    public void setDA(Integer DA) {
        this.DA.set(DA);
    }

    public IntegerProperty DAProperty() {
        return DA;
    }

    public Float getPercent() {
        return percent.get();
    }

    public void setPercent(float percent) {
        this.percent.set(percent);
    }

    public FloatProperty percentProperty() {
        return percent;
    }

}
