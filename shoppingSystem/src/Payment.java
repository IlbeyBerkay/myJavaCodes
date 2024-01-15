import java.time.LocalDateTime;

public class Payment {
    private static int paymentCounter = 0;
    private int paymentID ;
    private LocalDateTime paymentDate;
    private Double paymentAmount;
    private String paymentMethod;
    private int orderID;
    public Payment(double paymentAmount, String paymentMethod, int orderID) {
        this.paymentID = ++paymentCounter;
        this.paymentDate = LocalDateTime.now();
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
        this.orderID = orderID;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID( int paymentID){
        this.paymentID= paymentID;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate){
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount){
        this.paymentAmount =  paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod){

    }
    public int getOrderID() {
        return orderID;
    }


}
