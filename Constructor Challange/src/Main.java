public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim" , 1000 ,"tim@email.com");
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
        System.out.println(customer.getName());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());
        System.out.println(secondCustomer.getName());

        Customer thirdCustomer = new Customer("Ahmet" , "ahmet12@email.com");
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
        System.out.println(thirdCustomer.getName());


    }
}
