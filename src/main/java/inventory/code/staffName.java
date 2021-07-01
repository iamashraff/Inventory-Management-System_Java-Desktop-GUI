package inventory.code;

/**
 *
 * @author Muhamad Ashraff
 */
public class staffName {  //THIS IS A COMPOSITION CLASS
    
    //DATA MEMBERS
    private String firstName;
    private String middleName;
    private String lastName;

    public staffName() {
        this(null,null,null);
    }//DEFAULT CONSTRUCTOR

    public staffName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }//CONSTRUCTOR WITH PARAMETER

    public String getFirstName() {
        return firstName;
    }//GETTER FIRSTNAME

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//SETTER FIRSTNAME

    public String getMiddleName() {
        return middleName;
    }//GETTER MIDDLENAME

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }//SETTER MIDDLENAME

    public String getLastName() {
        return lastName;
    }//GETTER LASTNAME

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//SETTER LASTNAME

    @Override
    public String toString() {
        return "First Name  : " + firstName + "\n" +
               "Middle Name : " + middleName + "\n" +
               "Last Name   : " + lastName;
    }//END TOSTRING 
 
}//END CLASS
