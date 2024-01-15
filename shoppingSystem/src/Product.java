import java.util.List;

public class Product {
    private String productName ;
    private int productID;
    private String productType ;
    private double productPrice;
    private int sellerID;

    public  Product(String productName , int productID ,String productType ,double productPrice ,int sellerID){
        this.productName = productName;
        this.productID = productID ;
        this.productType =  productType;
        this.productPrice = productPrice ;
        this.sellerID = sellerID;
    }
    // Getter for name
    public String getProductName() {
        return productName;
    }

    // Setter for name
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    // Setter for name
    public void setProductName(int productID) {
        this.productID = productID;
    }


    public String getProductType() {
        return productType;
    }

    // Setter for name
    public void setProductType(String productType) {
        this.productType = productType;
    }


    public double getProductPrice() {
        return productPrice;
    }

    // Setter for name
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice ;
    }
    public int getSellerID() {
        return sellerID;
    }

    // Setter for name
    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

}
