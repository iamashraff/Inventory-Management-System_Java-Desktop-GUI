package inventory.code;

/**
 *
 * @author Muhamad Ashraff
 */
public class Computer extends Electronics { //INHERITS ELECTRONICS CLASS
    
    //DATA MEMBERS
    protected String computerName;
    protected int computerSerial;
    protected String computerProcessor;
    protected int computerRam;
    protected int computerStorage;
    protected boolean isDesktop;
    protected boolean isLaptop;

    public Computer (){
        this (null,0,null,0,0,false,false,null,null,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public Computer(String computerName, int computerSerial, String computerProcessor, int computerRam, int computerStorage, boolean isDesktop, boolean isLaptop, String productBrand, String productModel, int productId, String productName, int productQty, double productPrice) {
        super(productBrand, productModel, productId, productName, productQty, productPrice); //INVOKING SUPER CONSTRUCTOR
        this.computerName = computerName;
        this.computerSerial = computerSerial;
        this.computerProcessor = computerProcessor;
        this.computerRam = computerRam;
        this.computerStorage = computerStorage;
        this.isDesktop = isDesktop;
        this.isLaptop = isLaptop;
    }//CONSTRUCTOR WITH PARAMETER

    public String getComputerName() {
        return computerName;
    }//GETTER COMPUTERNAME

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }//SETTER COMPUTERNAME

    public int getComputerSerial() {
        return computerSerial;
    }//GETTER COMPUTERSERIAL

    public void setComputerSerial(int computerSerial) {
        this.computerSerial = computerSerial;
    }//SETTER COMPUTERSERIAL

    public String getComputerProcessor() {
        return computerProcessor;
    }//GETTER COMPUTERPROCESSOR

    public void setComputerProcessor(String computerProcessor) {
        this.computerProcessor = computerProcessor;
    }//SETTER COMPUTERPROCESSOR

    public int getComputerRam() {
        return computerRam;
    }//GETTER COMPUTERRAM

    public void setComputerRam(int computerRam) {
        this.computerRam = computerRam;
    }//SETTER COMPUTERRAM

    public int getComputerStorage() {
        return computerStorage;
    }//GETTER COMPUTERSTORAGE

    public void setComputerStorage(int computerStorage) {
        this.computerStorage = computerStorage;
    }//SETTER COMPUTERSTORAGE

    public boolean isIsDesktop() {
        return isDesktop;
    }//GETTER ISDESKTOP

    public void setIsDesktop(boolean isDesktop) {
        this.isDesktop = isDesktop;
    }//SETTER ISDESKTOP

    public boolean isIsLaptop() {
        return isLaptop;
    }//GETTER ISLAPTOP

    public void setIsLaptop(boolean isLaptop) {
        this.isLaptop = isLaptop;
    }//SETTER ISLAPTOP

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "============================================ \n" + 
               "Computer Name : " + computerName + "\n" + 
               "Serial No     : " + computerSerial + "\n" +
               "Processor     : " + computerProcessor + "\n" +
               "RAM           : " + computerRam + "\n" + 
               "Storage       : " + computerStorage + "\n" + 
               "isDesktop     : " + isDesktop +"\n" + 
               "isLaptop      : " + isLaptop ;
    }//END TOSTRING

    
    
}//END CLASS
