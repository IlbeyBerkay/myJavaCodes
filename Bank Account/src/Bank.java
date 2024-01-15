public class Bank {
     private String accountNumber ;
     private double accountBalance ;
     private  String customerName;
     private String email ;
     private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositIntoAccount(double depositAmount  ){
        accountBalance += depositAmount;
        System.out.println( customerName + " who user of our bank want to deposit him money into " + accountNumber + " account. His balance is " + accountBalance + ".So, we decided to allow it.");
        System.out.println("We sent papers him " + email + " address and SMS him " + phoneNumber + " phone"  );
        System.out.println("Deposit amount is " + depositAmount );
        System.out.println("New balance is " + accountBalance);
    }

    public void withdrawingIntoAccount(double withdrawalAmount){
        if(accountBalance - withdrawalAmount < 0){
            System.out.println("You are not allowed to withdraw funds !! You have only " + accountBalance);
        }
        else{
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " +withdrawalAmount+ " processed , Remaining balance = " +accountBalance);
        }
    }
}
