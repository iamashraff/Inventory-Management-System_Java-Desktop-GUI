package inventory.code;

import inventory.gui.checkFile;

/**
 *
 * @author Muhamad Ashraff
 */
public class Laptop extends Computer { //INHERITS COMPUTER CLASS
    
    //DATA MEMBERS
    private String laptopCategory;
    private double laptopWeight;

    public Laptop() {
        this (null,0.0,null,0,null,0,0,false,false,null,null,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR

    public Laptop(String laptopCategory, double laptopWeight, String computerName, int computerSerial, String computerProcessor, int computerRam, int computerStorage, boolean isDesktop, boolean isLaptop, String productBrand, String productModel, int productId, String productName, int productQty, double productPrice) {
        super(computerName, computerSerial, computerProcessor, computerRam, computerStorage, isDesktop, isLaptop, productBrand, productModel, productId, productName, productQty, productPrice);
        this.laptopCategory = laptopCategory;
        this.laptopWeight = laptopWeight;
    }//CONSTRUCTOR WITH PARAMETER

    public String getLaptopCategory() {
        return laptopCategory;
    }//GETTER LAPTOPCATEGORY

    public void setLaptopCategory(String laptopCategory) {
        this.laptopCategory = laptopCategory;
    }//SETTER LAPTOPCATEGORY

    public double getLaptopWeight() {
        return laptopWeight;
    }//GETTER LAPTOPWEIGHT

    public void setLaptopWeight(double laptopWeight) {
        this.laptopWeight = laptopWeight;
    }//SETTER LAPTOPWEIGHT
    
    //METHOD TO APPEND TEXT FILE OF LAPTOP PRODUCT
    public void appenddataLptp(){
        checkFile cf = new checkFile();
        cf.appendprodLaptop(productId, productName, productQty, productPrice, 
                            productBrand, productModel, computerName, 
                            computerSerial, computerProcessor, computerRam, computerStorage, 
                            isDesktop, isLaptop, laptopCategory, laptopWeight);
    }//END METHOD
    
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "============================================ \n" +
               "Laptop Category : " + laptopCategory + "\n" +
               "Laptop Weight  : " + laptopWeight;
    }

    
}//END CLASS
