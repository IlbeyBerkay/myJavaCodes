import java.util.ArrayList;
import java.util.List;

public class Panel {


    private List<User> userList;

    public Panel() {
        this.userList = new ArrayList<>();
    }

    public void registerUser(String userName, String userSurname , String mail, String address,String userID, String  userPassword,
                             ShoppingCart shoppingCart , List<Order> orderHistory,
                             String creditCardNo , String lastDate  ,String cvc) {
        User newUser = new User( userName,  userSurname ,  mail,  address, userID,   userPassword,
                 shoppingCart ,  orderHistory,
                 creditCardNo ,  lastDate  , cvc );
        userList.add(newUser);
        System.out.println("Registration successful!");
    }

    public boolean loginUser(String userName, String userPassword) {
        for (User user : userList) {
            if (user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword)) {
                System.out.println("Login successful!");
                return true;
            }
        }
        System.out.println("Login failed. Please check your username and password.");
        return false;
    }

    public boolean isUserRegistered(String userName) {
        for (User user : userList) {
            if (user.getUserName().equals(userName)) {
                System.out.println("User is registered.");
                return true;
            }
        }
        System.out.println("User is not registered.");
        return false;
    }



}
