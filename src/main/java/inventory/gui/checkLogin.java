package inventory.gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Muhamad Ashraff
 */
public class checkLogin {
    
    //DATA MEMBERS
    int staffId;
    String staffPass;

    public checkLogin() {
        this (0,null);
    }//DEFAULT CONSTRUCTOR
    
    public checkLogin(int staffId, String staffPass) {
        this.staffId = staffId;
        this.staffPass = staffPass;
    }//CONSTRUCTOR WITH PARAMETER
    
    //METHOD TO VERIFY THE LOGIN DATA EITHER IT IS MATCHED
    public boolean verifyLogin(){
        
    //VARIABLE DECLARATION
    boolean isLoginvalid = false;
    int n = this.staffId;
    n=n-1;
    String strPath = "C:/Staff.txt"; //PATH TO THE TXT FILE
    String lineStr = null;
    
    //USING TRY CATCH BLOCKS
    try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
        for (int i = 0; i < n; i++)
            br.readLine();
            lineStr = br.readLine(); //READ TXT OF NTH LINE
            
            //DECLARE ARRAY OF TEXT DATA
            String[] myData = lineStr.split(","); //SPLIT COMMA IN A LINE
            int dataStaffId = Integer.parseInt(myData[0]);
            String dataStaffPass = myData[1];
            
            /*USING IF STRUCTURE TO GET A RETURN VALUE EITHER IF THE LOGIN
              VALUE ENTERED BY THE USER IS VALID OR INVALID*/
            if(dataStaffPass.equals(staffPass) && dataStaffId == staffId){
                System.out.println("Logged In !"); 
                return isLoginvalid = true; //RETURN TRUE IF LOGIN IS VALID
            }else{
                System.out.println("Username or password is incorrect !");
                return isLoginvalid = false; //RETURN FALSE IF LOGIN IS INVALID
            }//END IF 
      }
      catch(IOException e){
        System.out.println(e);
      }//END TRY CATCH
        return isLoginvalid;
    }//END METHOD
    
    //METHOD TO GET STAFF ID AND NAME
    public String getstaffName(){
        int n = (this.staffId-1);
        String strPath = "C:/Staff.txt"; //PATH TO THE TXT FILE
        
        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
        for (int i = 0; i < n; i++)
            br.readLine();
            String lineStr = br.readLine(); //READ TXT OF NTH LINE
            
            //DECLARE ARRAY OF TEXT DATA
            String[] staffName = lineStr.split(","); //SPLIT COMMA IN A LINE
            String dataStaffName = staffName[2] + " " + staffName[3] + " " + staffName[4]; //GET DATA STAFF NAME
            return dataStaffName;
      }
      catch(IOException e){
        System.out.println(e);
      }//END TRY CATCH
        return null;
    }//END METHOD
    
    public String getstaffRole(){
        int n = (this.staffId-1);
        String strPath = "C:/Staff.txt"; //PATH TO THE TXT FILE
        
        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
        for (int i = 0; i < n; i++)
            br.readLine();
            String lineStr = br.readLine(); //READ TXT OF NTH LINE
            
            //DECLARE ARRAY OF TEXT DATA
            String[] staffRole = lineStr.split(","); //SPLIT COMMA IN A LINE
            String dataStaffRole = staffRole[11]; //GET DATA STAFF NAME
            return dataStaffRole;
      }
      catch(IOException e){
        System.out.println(e);
      }//END TRY CATCH
        
        return null;
    }
    
}//END CLASS
