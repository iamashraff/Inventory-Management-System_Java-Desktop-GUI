package inventory.code;

/**
 *
 * @author Muhamad Ashraff
 */
public class staffAddress { //THIS IS A COMPOSITION CLASS
    
    //DATA MEMBERS
    private String houseNo;
    private String buildingName;
    private String streetName;
    private int postcode;
    private String city;
    private String state;

    public staffAddress() {
        this(null,null,null,0,null,null);
    }//DEFAULT CONSTRUCTOR

    public staffAddress(String houseNo, String buildingName, String streetName, int postcode, String city, String state) {
        this.houseNo = houseNo;
        this.buildingName = buildingName;
        this.streetName = streetName;
        this.postcode = postcode;
        this.city = city;
        this.state = state;
    }//CONSTRUCTOR WITH PARAMETER

    public String getHouseNo() {
        return houseNo;
    }//GETTER HOUSENO

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }//SETTER HOUSENO

    public String getBuildingName() {
        return buildingName;
    }//GETTER BUILDINGNAME

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }//SETTER BUILDINGNAME

    public String getStreetName() {
        return streetName;
    }//GETTER STREETNAME

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }//SETTER STREETNAME

    public int getPostcode() {
        return postcode;
    }//GETTER POSTCODE

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }//SETTER POSTCODE

    public String getCity() {
        return city;
    }//GETTER CITY

    public void setCity(String city) {
        this.city = city;
    }//SETTER CITY

    public String getState() {
        return state;
    }//GETTER STATE

    public void setState(String state) {
        this.state = state;
    }//SETTER STATE

    @Override
    public String toString() {
        return  "House No      : " + houseNo + "\n" +
                "Building Name : " + buildingName + "\n" +  
                "Street Name   : " + streetName + "\n" +
                "Postcode      : " + postcode + "\n" +
                "City          : " + city + "\n" +
                "State         : " + state ;
    }//END TOSTRING
    
}//END CLASS
