
package Attendance.models;

import Attendance.persistence.AttendanceData;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

/**
 *
 * @author bosun
 */


/********************************************************
*********************************************************
     CheckBoxEntity Model for CheckBoxes Populating table
*********************************************************
*********************************************************/
public class CheckBoxEntity {

    //Using JavaFx Bean Property Instance Variables
    private BooleanProperty check;
    private BooleanProperty check1;
    private BooleanProperty check2;
    private BooleanProperty check3;
    private BooleanProperty check4;
    private BooleanProperty check5;
    private BooleanProperty check6;
    private BooleanProperty check7;
    private BooleanProperty check8;
    private BooleanProperty check9;
    private BooleanProperty check10;
    private BooleanProperty check11;
    private BooleanProperty check12;
    private BooleanProperty check13;
    private BooleanProperty check14;
    private BooleanProperty check15;
    private BooleanProperty check16;
    private BooleanProperty check17;
    private BooleanProperty check18;
    private BooleanProperty check19;
    private BooleanProperty check20;
    private BooleanProperty check21;
    private BooleanProperty check22;
    private BooleanProperty check23;
    private BooleanProperty check24;
    private BooleanProperty check25;
    private BooleanProperty check26;
    private BooleanProperty check27;
    private BooleanProperty check28;
    private BooleanProperty check29;
    private BooleanProperty check30;
    private BooleanProperty check31;
    
    
    //Constructors Overloaded for two Instances
    public CheckBoxEntity(Boolean check, Boolean check1, Boolean check2, Boolean check3, Boolean check4, Boolean check5, Boolean check6,
            Boolean check7, Boolean check8, Boolean check9, Boolean check10, Boolean check11, Boolean check12, Boolean check13, Boolean check14, Boolean check15,
            Boolean check16, Boolean check17, Boolean check18, Boolean check19, Boolean check20, Boolean check21, Boolean check22, Boolean check23, Boolean check24, Boolean check25,
            Boolean check26, Boolean check27, Boolean check28, Boolean check29, Boolean check30, Boolean check31) {
        this.check = new SimpleBooleanProperty(check);
        this.check1 = new SimpleBooleanProperty(check1);
        this.check2 = new SimpleBooleanProperty(check2);
        this.check3 = new SimpleBooleanProperty(check3);
        this.check4 = new SimpleBooleanProperty(check4);
        this.check5 = new SimpleBooleanProperty(check5);
        this.check6 = new SimpleBooleanProperty(check6);
        this.check7 = new SimpleBooleanProperty(check7);
        this.check8 = new SimpleBooleanProperty(check8);
        this.check9 = new SimpleBooleanProperty(check9);
        this.check10 = new SimpleBooleanProperty(check10);
        this.check11 = new SimpleBooleanProperty(check11);
        this.check12 = new SimpleBooleanProperty(check12);
        this.check13 = new SimpleBooleanProperty(check13);
        this.check14 = new SimpleBooleanProperty(check14);
        this.check15 = new SimpleBooleanProperty(check15);
        this.check16 = new SimpleBooleanProperty(check16);
        this.check17 = new SimpleBooleanProperty(check17);
        this.check18 = new SimpleBooleanProperty(check18);
        this.check19 = new SimpleBooleanProperty(check19);
        this.check20 = new SimpleBooleanProperty(check20);
        this.check21 = new SimpleBooleanProperty(check21);
        this.check22 = new SimpleBooleanProperty(check22);
        this.check23 = new SimpleBooleanProperty(check23);
        this.check24 = new SimpleBooleanProperty(check24);
        this.check25 = new SimpleBooleanProperty(check25);
        this.check26 = new SimpleBooleanProperty(check26);
        this.check27 = new SimpleBooleanProperty(check27);
        this.check28 = new SimpleBooleanProperty(check28);
        this.check29 = new SimpleBooleanProperty(check29);
        this.check30 = new SimpleBooleanProperty(check30);
        this.check31 = new SimpleBooleanProperty(check31);
    }

    public CheckBoxEntity(Boolean check, Boolean check1, Boolean check2, Boolean check3, Boolean check4, Boolean check5, Boolean check6,
            Boolean check7, Boolean check8, Boolean check9, Boolean check10, Boolean check11, Boolean check12, Boolean check13, Boolean check14, Boolean check15,
            Boolean check16, Boolean check17, Boolean check18, Boolean check19, Boolean check20, Boolean check21, Boolean check22, Boolean check23) {
        this.check = new SimpleBooleanProperty(check);
        this.check1 = new SimpleBooleanProperty(check1);
        this.check2 = new SimpleBooleanProperty(check2);
        this.check3 = new SimpleBooleanProperty(check3);
        this.check4 = new SimpleBooleanProperty(check4);
        this.check5 = new SimpleBooleanProperty(check5);
        this.check6 = new SimpleBooleanProperty(check6);
        this.check7 = new SimpleBooleanProperty(check7);
        this.check8 = new SimpleBooleanProperty(check8);
        this.check9 = new SimpleBooleanProperty(check9);
        this.check10 = new SimpleBooleanProperty(check10);
        this.check11 = new SimpleBooleanProperty(check11);
        this.check12 = new SimpleBooleanProperty(check12);
        this.check13 = new SimpleBooleanProperty(check13);
        this.check14 = new SimpleBooleanProperty(check14);
        this.check15 = new SimpleBooleanProperty(check15);
        this.check16 = new SimpleBooleanProperty(check16);
        this.check17 = new SimpleBooleanProperty(check17);
        this.check18 = new SimpleBooleanProperty(check18);
        this.check19 = new SimpleBooleanProperty(check19);
        this.check20 = new SimpleBooleanProperty(check20);
        this.check21 = new SimpleBooleanProperty(check21);
        this.check22 = new SimpleBooleanProperty(check22);
        this.check23 = new SimpleBooleanProperty(check23);
    }

    
    //toString method for Test
    @Override
    public String toString() {
        return "CheckBoxEntity" + "check=" + check + ", check1=" + check1 + ", check2=" + check2 + ", check3=" + check3 + ", check4=" + check4 + ", check5=" + check5 + ", check6=" + check6 + ", check7=" + check7 + ", check8=" + check8 + ", check9=" + check9 + ", check10=" + check10 + ", check11=" + check11 + ", check12=" + check12 + ", check13=" + check13 + ", check14=" + check14 + ", check15=" + check15 + ", check16=" + check16 + ", check17=" + check17 + ", check18=" + check18 + ", check19=" + check19 + ", check20=" + check20 + ", check21=" + check21 + ", check22=" + check22 + ", check23=" + check23 + ", DAYS_PRESENT=" + DAYS_PRESENT + '}';
    }

    //translate boolean value of checkboxes into Integers
    private int getValue(BooleanProperty bp) {
        if (bp.getValue() == true) {
            return 1;
        } else {
            return 0;
        }
    }

    //Caculate Number of Days Present from CheckBox Integer Values
    public int calculateDP() {
        //Calculate Days Present based on number of units
        if (AttendanceData.getUnits() == 3) {
            DAYS_PRESENT = getValue(check) + getValue(check1) + getValue(check2)
                    + getValue(check3) + getValue(check4) + getValue(check5) + getValue(check6)
                    + getValue(check7) + getValue(check8) + getValue(check9) + getValue(check10)
                    + getValue(check11) + getValue(check12) + getValue(check13) + getValue(check14)
                    + getValue(check15) + getValue(check16) + getValue(check17) + getValue(check18)
                    + getValue(check19) + getValue(check20) + getValue(check21) + getValue(check22)
                    + getValue(check23) + getValue(check24) + getValue(check25) + getValue(check26) + getValue(check27)
                    + getValue(check28) + getValue(check29) + getValue(check30) + getValue(check31);
        } else if (AttendanceData.getUnits() < 3 && AttendanceData.getUnits() >= 1) {
            DAYS_PRESENT = getValue(check) + getValue(check1) + getValue(check2)
                    + getValue(check3) + getValue(check4) + getValue(check5) + getValue(check6)
                    + getValue(check7) + getValue(check8) + getValue(check9) + getValue(check10)
                    + getValue(check11) + getValue(check12) + getValue(check13) + getValue(check14)
                    + getValue(check15) + getValue(check16) + getValue(check17) + getValue(check18)
                    + getValue(check19) + getValue(check20) + getValue(check21) + getValue(check22)
                    + getValue(check23) + getValue(check24);
        } else {
            DAYS_PRESENT = 0;
        }
        return DAYS_PRESENT;
    }

    //Caculate Number of Days Absent from CheckBox Integer Values
    public int calculateDA() {
        int days = 0;
        //Calculate Days Absent based on number of units
        if (AttendanceData.getUnits() == 3) {
            days = NO_OF_DAYS2 - calculateDP();
        } else {
            if (AttendanceData.getUnits() < 3 && AttendanceData.getUnits() >= 1) {
                days = NO_OF_DAYS1 - calculateDP();
            }

        }

        return days;
    }

    //Calculate Attendance Percetage
    public float calculatePercentage() {
        float days = 0;
        if (AttendanceData.getUnits() == 3) {
            days = (((float) calculateDP() / NO_OF_DAYS2) * 100);
        } else {
            if (AttendanceData.getUnits() < 3 && AttendanceData.getUnits() >= 1) {
                days = (((float) calculateDP() / NO_OF_DAYS1) * 100);
            }

        }
        return days;
    }

    //TODO no.of days present/NO_OF_DAYS * 100
    private static final int NO_OF_DAYS1 = 24;
    private static final int NO_OF_DAYS2 = 32;
    private int DAYS_PRESENT;

    
    /******************************
    ******Getters and Setters******
    * *****************************/
    
    public boolean getCheck() {
        return check.get();
    }

    public BooleanProperty checkProperty() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check.set(check);
    }

    public boolean getCheck1() {
        return check1.get();
    }

    public BooleanProperty check1Property() {
        return check1;
    }

    public void setCheck1(Boolean check1) {
        this.check1.set(check1);
    }

    public boolean getcheck2() {
        return check2.get();
    }

    public BooleanProperty check2Property() {
        return check2;
    }

    public void setCheck2(Boolean check2) {
        this.check2.set(check2);
    }

    public boolean getcheck3() {
        return check3.get();
    }

    public BooleanProperty check3Property() {
        return check3;
    }

    public void setCheck3(Boolean check3) {
        this.check3.set(check3);
    }

    public boolean getcheck4() {
        return check4.get();
    }

    public BooleanProperty check4Property() {
        return check4;
    }

    public void setCheck4(Boolean check4) {
        this.check4.set(check4);
    }

    public boolean getcheck5() {
        return check5.get();
    }

    public BooleanProperty check5Property() {
        return check5;
    }

    public void setCheck5(Boolean check5) {
        this.check5.set(check5);
    }

    public boolean getcheck6() {
        return check6.get();
    }

    public BooleanProperty check6Property() {
        return check6;
    }

    public void setCheck6(Boolean check6) {
        this.check6.set(check6);
    }

    public boolean getcheck7() {
        return check7.get();
    }

    public BooleanProperty check7Property() {
        return check7;
    }

    public void setCheck7(Boolean check7) {
        this.check7.set(check7);
    }

    public boolean getCheck8() {
        return check8.get();
    }

    public BooleanProperty check8Property() {
        return check8;
    }

    public void setCheck8(Boolean check8) {
        this.check8.set(check8);
    }

    public boolean getCheck9() {
        return check9.get();
    }

    public BooleanProperty check9Property() {
        return check9;
    }

    public void setCheck9(Boolean check9) {
        this.check9.set(check9);
    }

    public boolean getCheck10() {
        return check10.get();
    }

    public BooleanProperty check10Property() {
        return check10;
    }

    public void setCheck10(Boolean check10) {
        this.check10.set(check10);
    }

    public boolean getCheck11() {
        return check11.get();
    }

    public BooleanProperty check11Property() {
        return check11;
    }

    public void setCheck11(Boolean check11) {
        this.check11.set(check11);
    }

    public boolean getCheck12() {
        return check12.get();
    }

    public BooleanProperty check12Property() {
        return check12;
    }

    public void setCheck12(Boolean check12) {
        this.check12.set(check12);
    }

    public boolean getCheck13() {
        return check13.get();
    }

    public BooleanProperty check13Property() {
        return check13;
    }

    public void setCheck13(Boolean check13) {
        this.check13.set(check13);
    }

    public boolean getCheck14() {
        return check14.get();
    }

    public BooleanProperty check14Property() {
        return check14;
    }

    public void setCheck14(Boolean check14) {
        this.check14.set(check14);
    }

    public boolean getCheck15() {
        return check15.get();
    }

    public BooleanProperty check15Property() {
        return check15;
    }

    public void setCheck15(Boolean check15) {
        this.check15.set(check15);
    }

    public boolean getCheck16() {
        return check16.get();
    }

    public BooleanProperty check16Property() {
        return check16;
    }

    public void setCheck16(Boolean check16) {
        this.check16.set(check16);
    }

    public boolean getCheck17() {
        return check17.get();
    }

    public BooleanProperty check17Property() {
        return check17;
    }

    public void setCheck17(Boolean check17) {
        this.check17.set(check17);
    }

    public boolean getCheck18() {
        return check18.get();
    }

    public BooleanProperty check18Property() {
        return check18;
    }

    public void setCheck18(Boolean check18) {
        this.check18.set(check18);
    }

    public boolean getCheck19() {
        return check19.get();
    }

    public BooleanProperty check19Property() {
        return check19;
    }

    public void setCheck19(Boolean check19) {
        this.check19.set(check19);
    }

    public boolean getCheck20() {
        return check20.get();
    }

    public BooleanProperty check20Property() {
        return check20;
    }

    public void setCheck20(Boolean check20) {
        this.check20.set(check20);
    }

    public boolean getCheck21() {
        return check21.get();
    }

    public BooleanProperty check21Property() {
        return check21;
    }

    public void setCheck21(Boolean check21) {
        this.check21.set(check21);
    }

    public boolean getCheck22() {
        return check22.get();
    }

    public BooleanProperty check22Property() {
        return check22;
    }

    public void setCheck22(Boolean check22) {
        this.check22.set(check22);
    }

    public boolean getCheck23() {
        return check23.get();
    }

    public BooleanProperty check23Property() {
        return check23;
    }

    public void setCheck23(Boolean check23) {
        this.check23.set(check23);
    }

    public boolean getCheck24() {
        return check24.get();
    }

    public BooleanProperty check24Property() {
        return check24;
    }

    public void setCheck24(Boolean check24) {
        this.check24.set(check24);
    }

    public boolean getCheck25() {
        return check25.get();
    }

    public BooleanProperty check25Property() {
        return check25;
    }

    public void setCheck25(Boolean check25) {
        this.check25.set(check25);
    }

    public boolean getCheck26() {
        return check26.get();
    }

    public BooleanProperty check26Property() {
        return check26;
    }

    public void setCheck26(Boolean check26) {
        this.check26.set(check26);
    }

    public boolean getCheck27() {
        return check27.get();
    }

    public BooleanProperty check27Property() {
        return check27;
    }

    public void setCheck27(Boolean check27) {
        this.check27.set(check27);
    }

    public boolean getCheck28() {
        return check28.get();
    }

    public BooleanProperty check28Property() {
        return check28;
    }

    public void setCheck28(Boolean check28) {
        this.check28.set(check28);
    }

    public boolean getCheck29() {
        return check29.get();
    }

    public BooleanProperty check29Property() {
        return check29;
    }

    public void setCheck29(Boolean check29) {
        this.check29.set(check29);
    }

    public boolean getCheck30() {
        return check30.get();
    }

    public BooleanProperty check30Property() {
        return check30;
    }

    public void setCheck30(Boolean check30) {
        this.check30.set(check30);
    }

    public boolean getCheck31() {
        return check31.get();
    }

    public BooleanProperty check31Property() {
        return check31;
    }

    public void setCheck31(Boolean check31) {
        this.check31.set(check31);
    }

    public int getDAYS_PRESENT() {
        return DAYS_PRESENT;
    }

    public void setDAYS_PRESENT(int DAYS_PRESENT) {
        this.DAYS_PRESENT = DAYS_PRESENT;
    }

}
