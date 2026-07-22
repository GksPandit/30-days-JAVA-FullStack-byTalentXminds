package Day9;


// 🏦 Project: Simple Bank Management System

// final class -> cannot be inherited
final class Vault {

}
public class Bank {
    // Constants
    private static final int BRANCH_CODE = 100097;
    private static final float MIN_BALANCE = 1000.0f;
    private static final float INTEREST_RATE = 6.5f;

    // Shared Data
    private static int noOfAccounts = 0;

    static {
        System.out.println("******** SBI Bank Started ********");
    }

    // account counting that how many accounts
    private static void increaseNoOfAcc() {
        noOfAccounts++;
    }

    // ---------Instance Variables-------------
    private int accountNo;
    private float balance;
    private String name;
    private int age;
    private boolean active = true;

    //--------- constructor---------
    public Bank(float balance, String name, int age) {

        accountNo = noOfAccounts + 1;
        increaseNoOfAcc();

        this.balance = balance;
        this.name = name;
        this.age = age;
    }

    // Final Method
    final void rules() {
        System.out.println("Bank Rules Cannot Be Changed");
    }
    // Getter
    public float getBalance() {
        return balance;
    }
    //Deposit
    public String deposit(float amount){
        if(!active)
            return "Account is Closed";
        if(amount <= 0)
            return "Invalid Amount";
        balance += amount;

        return "Amount Deposited Successfully";
    }

    // Withdraw
    public String withdrawal(float amount){

        if(!active)
            return "Account is Closed";
        if(amount <= 0){
            return "Invalid Amount";
        }
        if(balance - amount < MIN_BALANCE){
            return "Minimum Balance should be " + MIN_BALANCE;
        }
        balance = balance - amount;
        return "Remaining Balance = "+ balance;
    }

    // Assignment 1 : isMinimumBalanceMaintained() -> minbal = 1000;
    public boolean isMinimumBalanceMaintained() {
        return balance >= MIN_BALANCE;
    }

    //Assignment 2 : calculate interest - bank set their interest rates
    public float calculateInterest(){
        return (balance * INTEREST_RATE)/100;
    }

    //Assignment 3 : close account -> status
    public String closeAccount() {
        if (balance > 0)
            return "Withdraw Remaining Balance First";

        active = false;
        return "Account Closed Successfully";
    }

        @Override
        public String toString() {
            return "Bank{" +
                    "BranchCode=" + BRANCH_CODE +
                    ", AccountNo=" + accountNo +
                    ", Balance=" + balance +
                    ", Name='" + name + '\'' +
                    ", Age=" + age +
                    ", Active=" + active +
                    ", TotalAccounts=" + noOfAccounts +
                    '}';

    }
}