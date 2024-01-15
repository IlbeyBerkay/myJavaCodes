import java.util.ArrayList;
import java.util.List;

public class User {


     private String userName ,userSurname;

     private String mail;
     private String address;
     private String userID;
     private String  userPassword;
     private ShoppingCart shoppingCart;
     private List<Order> orderHistory;

     private String creditCardNo ;
     private String lastDate ;
     private String cvc;

     public User(String userName, String userSurname , String mail, String address,String userID, String  userPassword,
                     ShoppingCart shoppingCart , List<Order> orderHistory,
                     String creditCardNo , String lastDate  ,String cvc  ){

          this.userName = userName;
          this.userSurname = userSurname;
          this.mail = mail;
          this.address = address;
          this.userID = userID;
          this.userPassword = userPassword;
          this.shoppingCart = new ShoppingCart();
          this.orderHistory = new ArrayList<>();
          this.creditCardNo = null;
          this.lastDate = null;
          this.cvc = cvc;
     }


     public String getUserName() {
          return userName;
     }
     public void setUserName(String userName) {
          this.userName =userName;
     }

     public  String getUserSurname() {
          return userSurname;
     }
     public  void setUserSurname(String userSurname) {
          this.userSurname = userSurname;
     }
     public String getMail() {
          return mail;
     }
     public void setMail(String mail) {
          this.mail = mail;
     }
     public String getAddress() {
          return address;
     }
     public void setAddress(String address) {
          this.address = address;
     }

     public String getUserID() {
          return userID;
     }
     public void setUserID(String userID) {
          this.userID = userID;
     }

     public String getUserPassword() {
          return userPassword;
     }
     public void setUserPassword(String userPassword) {
          this.userPassword = userPassword;
     }

     public ShoppingCart getShoppingCart() {
          return shoppingCart;
     }
     public void setShoppingCart(ShoppingCart shoppingCart) {
          this.shoppingCart = new ShoppingCart();
     }

     public List<Order> getOrderHistory () {
          return orderHistory;
     }
     public void setOrderHistory(List<Order> orderHistory) {
          this.orderHistory = new ArrayList<>();
     }

     public String getCreditCardNo() {
          return creditCardNo;
     }
     public void setCreditCardNo(String creditCardNo) {
          this.creditCardNo =creditCardNo ;
     }

     public String getLastDate() {
          return lastDate ;
     }
     public void setLastDate(String lastDate) {
          this.lastDate = lastDate;
     }

     public String getCvc() {
          return  cvc;
     }
     public void setCvc(String cvc) {
          this.cvc = cvc;
     }

     public void addCreditCard(String creditCardNo, String lastDate , String cvc ) {
          this.creditCardNo = creditCardNo;
          this.lastDate = lastDate;
          this.cvc = cvc;
     }
     public void updateUserInfo(String newUserName, String newUserSurname,String newMail, String newAddress,String newUserID, String newUserPassword , String
             newCreditCardNo ,   String newLastDate ,    String newCvc ) {
          this.userName = newUserName;
          this.userSurname = newUserSurname;
          this.mail = newMail;
          this.address = newAddress;
          this.userID = newUserID;
          this.userPassword = newUserPassword;
          this.creditCardNo = newCreditCardNo;
          this.lastDate = newLastDate;
          this.cvc = newCvc;
     }

     public void deleteUserInfo() {

          this.userName = null;
          this.userSurname = null;
          this.mail = null;
          this.address=null;
          this.userID = null;
          this.userPassword = null;
          this.creditCardNo = null;
          this.lastDate = null;
          this.cvc = null;
     }


}
