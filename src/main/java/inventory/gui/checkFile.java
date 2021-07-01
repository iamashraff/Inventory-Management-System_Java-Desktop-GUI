package inventory.gui;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import inventory.code.Desktop;
import java.io.FileNotFoundException;
/**
 *
 * @author Muhamad Ashraff
 */
public class checkFile{
    String strProduct = "C:/Products.txt";
    String strStaff = "C:/Staff.txt";
    
    public checkFile(){        
        try {
            File file = new File(strProduct);
            boolean fvar = file.createNewFile();
                if (fvar){
                    System.out.println("File Created !");
                }
                else{
                    System.out.println("File Exists !");
                }//END IF   
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH
        
        try {
            File file = new File(strStaff);
            boolean fvar = file.createNewFile();
                if (fvar){
                    System.out.println("File Created !");
                }
                else{
                    System.out.println("File Exists !");
                }//END IF
        } catch (FileNotFoundException e) {
            e.printStackTrace();        
        } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH
        
    }//DEFAULT CONSTRUCTOR
    
    
    public void appendprodDesktop(int pId, String pName, int pQty, double pPrice, String pBrand, String pModel, String cName,
                                  int cSerial, String cProc, int cRam, int cStorage, boolean isDsktp, boolean isLptp, String cCategory){
        
        //USING IF STATEMENT TO DETERMINE EITHER THE PRODUCT IS DESKTOP OR LAPTOP
        String compType = null;
        if(isDsktp == true){
            compType = "Desktop";
        }else
        if(isLptp == true) {
            compType = "Laptop";
        }//END IF
        
        //USING TRY CATCH
        try {
            String getData =  pId+","+compType+","+pName+","+pQty+","+pPrice+","+
                              pBrand+","+pModel+","+
                              cName+","+cSerial+","+cProc+","+cRam+","+cStorage+","+cCategory+"\n";
            File file = new File(strProduct);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getData);
            bw.close();
            System.out.println("Data has been saved !");
            
        } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH
    }//END METHOD
    
    public void appendprodLaptop(int pId, String pName, int pQty, double pPrice, String pBrand, String pModel, String cName,
                                  int cSerial, String cProc, int cRam, int cStorage, boolean isDsktp, boolean isLptp, 
                                  String lpCategory, double lpWeight){
        //USING IF STATEMENT TO DETERMINE EITHER THE PRODUCT IS DESKTOP OR LAPTOP
        String compType = null;
        if(isDsktp == true){
            compType = "Desktop";
        }else
        if(isLptp == true) {
            compType = "Laptop";
        }//END IF
        
        //USING TRY CATCH
        try {
            String getData =  pId+","+compType+","+pName+","+pQty+","+pPrice+","+
                              pBrand+","+pModel+","+
                              cName+","+cSerial+","+cProc+","+cRam+","+cStorage+","+lpCategory+","+lpWeight+"\n";
            File file = new File(strProduct);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getData);
            bw.close();
            System.out.println("Data has been saved !");
            
        } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH
        
    }//END METHOD
    
    
    public void appendprodSmartphone(int pId, String pName, int pQty, double pPrice, String pBrand, String pModel,
                                     String dName,int dImei, int dRam, int dStorage, double dWeight,
                                     boolean isSmartphone, boolean isTablet, String spCategory){
    
        String mobiledevType = null;
        if(isSmartphone == true){
            mobiledevType = "Smartphone";
        }
        else
        if(isTablet == true){
            mobiledevType = "Tablet";
        }//END IF
    
    //USING TRY CATCH
        try {
            String getData =  pId+","+mobiledevType+","+pName+","+pQty+","+pPrice+","+
                              pBrand+","+pModel+","+
                              dName+","+dImei+","+dRam+","+dStorage+","+dWeight+","+spCategory+"\n";
            File file = new File(strProduct);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getData);
            bw.close();
            System.out.println("Data has been saved !");
            
        } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH    
    
    }//END METHOD
    
    public void appendprodTablet(int pId, String pName, int pQty, double pPrice, String pBrand, String pModel,
                                 String dName,int dImei, int dRam, int dStorage, double dWeight,
                                 boolean isSmartphone, boolean isTablet, String tbCategory){
        
        String mobiledevType = null;
        if(isSmartphone == true){
            mobiledevType = "Smartphone";
        }
        else
        if(isTablet == true){
            mobiledevType = "Tablet";
        }//END IF
        
        //USING TRY CATCH
        try {
            String getData =  pId+","+mobiledevType+","+pName+","+pQty+","+pPrice+","+
                              pBrand+","+pModel+","+
                              dName+","+dImei+","+dRam+","+dStorage+","+dWeight+","+tbCategory+"\n";
            File file = new File(strProduct);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getData);
            bw.close();
            System.out.println("Data has been saved !");
            
        } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH 
    
    }//END METHOD
    
}//END CLASS
