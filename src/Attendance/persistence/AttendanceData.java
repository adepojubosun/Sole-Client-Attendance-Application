
package Attendance.persistence;

/**
 *
 * @author bosun
 */


/*******************************************
********************************************
            Persistence Class
********************************************
********************************************/
public class AttendanceData {

    public static ProgramData data = new ProgramData();//static instance of predefined data
    private static String code;
    private static int units;

    
    
     /******************************
    ******Getters and Setters******
    * *****************************/
    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        AttendanceData.code = code;
    }

    public static int getUnits() {
        return units;
    }

    public static void setUnits(int units) {
        AttendanceData.units = units;
    }

}
