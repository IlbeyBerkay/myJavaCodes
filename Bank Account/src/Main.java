public class Main {
    public static void main(String[] args) {
        Bank bankAccount = new Bank();
        bankAccount.withdrawingIntoAccount(100);
        bankAccount.depositIntoAccount(250);
        bankAccount.withdrawingIntoAccount(50);
        bankAccount.setAccountNumber("123456789");
        bankAccount.setAccountBalance(500);
        bankAccount.setCustomerName("Ahmet");
        bankAccount.setEmail("coşkun1999@hotmail.com");
        bankAccount.setPhoneNumber("5326451232");
        System.out.println( bankAccount.getAccountNumber());
        System.out.println( bankAccount.getAccountBalance());
        System.out.println(bankAccount.getCustomerName());
        System.out.println( bankAccount.getEmail());
        System.out.println( bankAccount.getPhoneNumber());



    }
}
