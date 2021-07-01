package inventory.code;

/**
 *
 * @author Muhamad Ashraff
 */
public class MobileDevice extends Electronics { //INHERIT ELECTRONICS CLASS
    
    //DATA MEMBERS
    protected String deviceName;
    protected int deviceImei;
    protected int deviceRam;
    protected int deviceStorage;
    protected double deviceWeight;
    protected boolean isSmartphone;
    protected boolean isTablet;

    public MobileDevice(){
        this(null,0,0,0,0.0,false,false,null,null,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public MobileDevice(String deviceName, int deviceImei, int deviceRam, int deviceStorage, double deviceWeight, boolean isSmartphone, boolean isTablet, String productBrand, String productModel, int productId, String productName, int productQty, double productPrice) {
        super(productBrand, productModel, productId, productName, productQty, productPrice);
        this.deviceName = deviceName;
        this.deviceImei = deviceImei;
        this.deviceRam = deviceRam;
        this.deviceStorage = deviceStorage;
        this.deviceWeight = deviceWeight;
        this.isSmartphone = isSmartphone;
        this.isTablet = isTablet;
    }//CONSTRUCTOR WITH PARAMETER

    public String getDeviceName() {
        return deviceName;
    }//GETTER DEVICENAME

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }//SETTER DEVICENAME

    public int getDeviceImei() {
        return deviceImei;
    }//GETTER DEVICEIMEI

    public void setDeviceImei(int deviceImei) {
        this.deviceImei = deviceImei;
    }//SETTER DEVICEIMEI

    public int getDeviceRam() {
        return deviceRam;
    }//GETTER DEVICERAM

    public void setDeviceRam(int deviceRam) {
        this.deviceRam = deviceRam;
    }//SETTER DEVICERAM

    public int getDeviceStorage() {
        return deviceStorage;
    }//GETTER DEVICESTORAGE

    public void setDeviceStorage(int deviceStorage) {
        this.deviceStorage = deviceStorage;
    }//SETTER DEVICESTORAGE

    public double getDeviceWeight() {
        return deviceWeight;
    }//GETTER DEVICEWEIGHT

    public void setDeviceWeight(double deviceWeight) {
        this.deviceWeight = deviceWeight;
    }//SETTER DEVICEWEIGHT

    public boolean isIsSmartphone() {
        return isSmartphone;
    }//GETTER ISSMARTPHONE

    public void setIsSmartphone(boolean isSmartphone) {
        this.isSmartphone = isSmartphone;
    }//SETTER ISSMARTPHONE

    public boolean isIsTablet() {
        return isTablet;
    }//GETTER ISTABLET

    public void setIsTablet(boolean isTablet) {
        this.isTablet = isTablet;
    }//SETTER ISTABLET

    @Override
    public String toString() {
        return
        super.toString() + "\n" +
        "============================================ \n" +         
        "Device Name  : " + deviceName + "\n" + 
        "IMEI         : " + deviceImei + "\n" +  
        "RAM          : " + deviceRam + "\n" +  
        "Storage      : " + deviceStorage + "\n" +  
        "Weight       : " + deviceWeight + "\n" +  
        "isSmartphone : " + isSmartphone + "\n" +  
        "isTablet     : " + isTablet ;
    }//END TOSTRING
    
}//END CLASS
