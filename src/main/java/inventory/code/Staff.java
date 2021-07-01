package inventory.code;

import inventory.gui.addUser;

/**
 *
 * @author Muhamad Ashraff
 */
public class Staff { //SUPERCLASS
    
    //DATA MEMBERS
    private int staffId;
    private String staffPass;
    private String staffRole;
    private staffName name; //'HAS-A' RELATIONSHIP (COMPOSITION)
    private staffAddress address; //'HAS-A' RELATIONSHIP (COMPOSITION)

    public Staff() {
        staffId = 0;
        staffPass = null;
        name = new staffName(null, null, null);
        address = new staffAddress(null, null, null, 0, null, null);
        staffRole = null;
    }//DEFAULT CONSTRUCTOR

    public Staff(int staffId, String staffPass, String firstName, String middleName, String lastName, String houseNo, String buildingName, String streetName, int postcode, String city, String state, String staffRole) {
        this.staffPass = staffPass;
        this.staffId = staffId;
        this.name = new staffName(firstName, middleName, lastName);
        this.address = new staffAddress(houseNo, buildingName, streetName, postcode, city, state);
        this.staffRole = staffRole;
        addUser au = new addUser();
        au.appendUserdata(staffId, staffPass, firstName, middleName, lastName, houseNo, buildingName, streetName, postcode, city, state, staffRole);  
    }//CONSTRUCTOR WITH PARAMETER

    public int getStaffId() {
        return staffId;
    }//GETTER STAFFID

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }//SETTER STAFFID
    
        public String getStaffPass() {
        return staffPass;
    }//GETTER STAFFPASS

    public void setStaffPass(String staffPass) {
        this.staffPass = staffPass;
    }//SETTER STAFFPASS

    public staffName getName() {
        return this.name;
    }//GETTER STAFFNAME

    public void setName(String firstName, String middleName, String lastName) {
        this.name = new staffName(firstName, middleName, lastName);
    }//SETTER STAFFNAME

    public staffAddress getAddress() {
        return this.address;
    }//GETTER STAFFADDRESS

    public void setAddress(String houseNo, String buildingName, String streetName, int postcode, String city, String state) {
        this.address = new staffAddress(houseNo, buildingName, streetName, postcode, city, state);
    }//SETTER STAFFADDRESS

    @Override
    public String toString() {
        return "Staff ID : " + staffId + "\n" +
               name + "\n" + 
               address;
    }//END TOSTRING

}//END CLASS
