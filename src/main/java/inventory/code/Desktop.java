package inventory.code;
import inventory.gui.checkFile;
/**
 *
 * @author Muhamad Ashraff
 */
public class Desktop extends Computer {
    
    //DATA MEMBERS
    private String computerCategory;
    
    public Desktop () {
        this (null, null,0,null,0,0,false,false,null,null,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public Desktop(String computerCategory, String computerName, int computerSerial, 
                   String computerProcessor, int computerRam, int computerStorage, 
                   boolean isDesktop, boolean isLaptop, String productBrand, 
                   String productModel, int productId, String productName, 
                   int productQty, double productPrice) {
        
        super(computerName, computerSerial, computerProcessor, 
                computerRam, computerStorage, isDesktop, 
                isLaptop, productBrand, productModel, 
                productId, productName, productQty, productPrice);
        this.computerCategory = computerCategory;
    }//CONSTRUCTOR WITH PARAMETER

    public String getComputerCategory() {
        return computerCategory;
    }//GETTER COMPUTERCATEGORY

    public void setComputerCategory(String computerCategory) {
        this.computerCategory = computerCategory;
    }//SETTER COMPUTERCATEGORY
    
    //METHOD TO APPEND TEXT FILE OF DESKTOP PRODUCT
    public void appenddataDsktp(){
        checkFile cf = new checkFile();
        cf.appendprodDesktop(productId,productName,productQty,productPrice,
                             productBrand,productModel,
                             computerName,computerSerial,computerProcessor,computerRam,computerStorage,isDesktop, isLaptop,
                             computerCategory);
    }//END METHOD
    
    @Override
    public String toString() {
        return 
        super.toString() + "\n" +
        "============================================ \n" +         
        "Computer Category : " + computerCategory + "\n";
    }//END TOSTRING
    
    
}//END CLASS
