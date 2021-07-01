package inventory.code;

import inventory.gui.checkFile;

/**
 *
 * @author Muhamad Ashraff
 */
public class Smartphone extends MobileDevice { //INHERITS MOBILEDEVICE CLASS
    
    //DATA MEMBERS
    private String smartphoneCategory;

    public Smartphone() {
        this(null,null,0,0,0,0.0,false,false,null,null,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR

    public Smartphone(String smartphoneCategory, String deviceName, int deviceImei, int deviceRam, int deviceStorage, double deviceWeight, boolean isSmartphone, boolean isTablet, String productBrand, String productModel, int productId, String productName, int productQty, double productPrice) {
        super(deviceName, deviceImei, deviceRam, deviceStorage, deviceWeight, isSmartphone, isTablet, productBrand, productModel, productId, productName, productQty, productPrice);
        this.smartphoneCategory = smartphoneCategory;
    }//CONSTRUCTOR WITH PARAMETER

    public String getSmartphoneCategory() {
        return smartphoneCategory;
    }//GETTER SMARTPHONECATEGORY

    public void setSmartphoneCategory(String smartphoneCategory) {
        this.smartphoneCategory = smartphoneCategory;
    }//SETTER SMARTPHONECATEGORY
    
    //METHOD TO APPEND TEXT FILE OF SMARTPHONE PRODUCT
    public void appenddataSmartphone(){
        checkFile cf = new checkFile();
        cf.appendprodSmartphone(productId, productName, productQty, productPrice, productBrand, productModel,
                                deviceName, deviceImei, deviceRam, deviceStorage, deviceWeight, isSmartphone, isTablet, 
                                smartphoneCategory);
    }//END METHOD
    
    @Override
    public String toString() {
        return
        super.toString() + "\n" +
        "============================================ \n" + 
        "Smartphone Category : " + smartphoneCategory ;
    }//END TOSTRING

}//END CLASS
