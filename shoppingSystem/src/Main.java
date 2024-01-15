public class Main {
    public static void main(String[] args) {
        // Create an instance of Based class
        Based user = new Based("John", "Doe", "john.doe@example.com", "123 Main St", "1", "password123");

        // Access and display user details
        System.out.println("User Details:");
        System.out.println("Username: " + user.getUserName());
        System.out.println("User Surname: " + user.getUserSurname());
        System.out.println("Email: " + user.getMail());
        System.out.println("Address: " + user.getAddress());
        System.out.println("UserID: " + user.getUserID());
        System.out.println("User Password: " + user.getUserPassword());


    }
}
