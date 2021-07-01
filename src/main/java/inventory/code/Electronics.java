package inventory.code;

/**
 *
 * @author Muhamad Ashraff
 */
public class Electronics extends Products { //INHERITS PRODUCTS CLASS
    
    //DATA MEMBERS
    protected String productBrand;
    protected String productModel;

    public Electronics() {
        this (null,null,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR

    public Electronics(String productBrand, String productModel, int productId, String productName, int productQty, double productPrice) {
        super(productId, productName, productQty, productPrice);
        this.productBrand = productBrand;
        this.productModel = productModel;
    }//CONSTRUCTOR WITH PARAMETER

    public String getProductBrand() {
        return productBrand;
    }//GETTER PRODUCTBRAND

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }//SETTER PRODUCTBRAND

    public String getProductModel() {
        return productModel;
    }//GETTER PRODUCTMODEL

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }//SETTER PRODUCTMODEL

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "============================================ \n" +  
               "Product Brand : " + productBrand + "\n" +
               "Product Model : " + productModel ;
    }//END TOSTRING 
    
}//END CLASS
