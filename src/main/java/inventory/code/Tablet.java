package inventory.code;

import inventory.gui.checkFile;

/**
 *
 * @author Muhamad Ashraff
 */
public class Tablet extends MobileDevice { //INHERITS MOBILEDEVICE CLASS
    
    //DATA MEBERS
    private String tabletCategory;

    public Tablet() {
        this(null,null,0,0,0,0.0,false,false,null,null,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR

    public Tablet(String tabletCategory, String deviceName, int deviceImei, int deviceRam, int deviceStorage, double deviceWeight, boolean isSmartphone, boolean isTablet, String productBrand, String productModel, int productId, String productName, int productQty, double productPrice) {
        super(deviceName, deviceImei, deviceRam, deviceStorage, deviceWeight, isSmartphone, isTablet, productBrand, productModel, productId, productName, productQty, productPrice);
        this.tabletCategory = tabletCategory;
    }//CONSTRUCTOR WITH PARAMETER

    public String getTabletCategory() {
        return tabletCategory;
    }//GETTER TABLETCATEGORY

    public void setTabletCategory(String tabletCategory) {
        this.tabletCategory = tabletCategory;
    }//SETTER TABLETCATEGORY
    
    //METHOD TO APPEND TEXT FILE OF TABLET PRODUCT
    public void appenddataTablet(){
        checkFile cf = new checkFile();
        cf.appendprodTablet(productId, productName, productQty, productPrice, productBrand, productModel, 
                            deviceName, deviceImei, deviceRam, deviceStorage, deviceWeight, 
                            isSmartphone, isTablet, tabletCategory);
    }//END METHOD

    @Override
    public String toString() {
        return
        super.toString() + "\n" +
        "============================================ \n" + 
        "Tablet Category : " + tabletCategory;
    }//END TOSTRING
    
}//END CLASS
