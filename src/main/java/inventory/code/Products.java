package inventory.code;

/**
 *
 * @author Muhamad Ashraff
 */

public class Products { //SUPERCLASS
    
    //DATA MEMBERS
    protected int productId;
    protected String productName;
    protected int productQty;
    protected double productPrice;

    public Products() {
        this (0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR

    public Products(int productId, String productName, int productQty, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
    }//CONSTRUCTOR WITH PARAMETER

    public int getProductId() {
        return productId;
    }//GETTER PRODUCTID

    public void setProductId(int productId) {
        this.productId = productId;
    }//SETTER PRODUCTID

    public String getProductName() {
        return productName;
    }//GETTER PRODUCTNAME

    public void setProductName(String productName) {
        this.productName = productName;
    }//SETTER PRODUCTNAME

    public int getProductQty() {
        return productQty;
    }//GETTER PRODUCTQUANTITY

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }//SETTER PRODUCTQUANTITY

    public double getProductPrice() {
        return productPrice;
    }//GETTER PRODUCTPRICE

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }//SETTER PRODUCTPRICE

    @Override
    public String toString() {
        return  "Product ID    : " + productId + "\n" + 
                "Product Name  : " + productName + "\n" + 
                "Product Qty   : " + productQty + "\n" + 
                "Product Price : " + productPrice;
    }//END TOSTRING
    
}//END CLASS
