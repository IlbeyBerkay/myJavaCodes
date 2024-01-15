import java.util.List;

public class Order {

    private static int orderCounter = 0 ;
    private List<Product> items;
    private double total;
    private int orderID;
    private String shippingAddress  ;
    private int sellerID;


    public Order(List<Product> items, double total ,int orderID ,String shippingAddress , int sellerID  ) {
        this.items = items;
        this.total = total;
        this.orderID = ++orderCounter;
        this.shippingAddress = shippingAddress ;
        this.sellerID = sellerID;

    }

    public List<Product> getItem(){
        return items;
    }
    public void setItems(List<Product> items){
        this.items =items;
    }

    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total = total;
    }

    public int getOrderID(){
        return orderID;
    }
    public void setOrderID(int  orderID){
        this.orderID=orderID;
    }

    public String getShippingAddress(){
        return shippingAddress ;
    }
    public void setShippingAddress(String shippingAddress ){
        this.shippingAddress  = shippingAddress ;
    }

    public int getSellerID() {
        return sellerID;
    }

    // Setter for name
    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }


}
