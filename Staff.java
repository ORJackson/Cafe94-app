import java.util.ArrayList;
import java.util.Date;

public class Staff extends User{

    private int staffId;

    private ArrayList<Shift> shifts = new ArrayList<Shift>();
    private StaffType staffType;

    //Constructor - OJ
    //Added StaffTypeEnum to tell the difference between the staff (look at driver,chef,waiter they are same class not need to have 3) SR
    public Staff(String username, String password, String firstName, String lastName, int staffId, String homeAddress,StaffType staffType){
        super(username, password, firstName, lastName, homeAddress);
        this.staffType = staffType;
        this.staffId = staffId;
    }


    //Getters - OJ
    public int getStaffId() {
        return staffId;
    }


    // Method returns arrayList of shifts
    public ArrayList<Shift> getShifts() {
        return shifts;
    }


    //Setters - OJ
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }


}