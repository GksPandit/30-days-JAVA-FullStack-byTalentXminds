package Day9;

public class day9 {
    public static void main(String[] args) {

        Bank acc1 = new Bank(1000, "Nikhil", 25);
        Bank acc2 = new Bank(1000, "Jikesh", 22);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println();

        // Deposit
        System.out.println(acc1.deposit(1000));
        System.out.println(acc1.getBalance());
        System.out.println();

        // Withdraw
        System.out.println(acc1.withdrawal(2000));
        System.out.println(acc1.getBalance());
        System.out.println();

        // Minimum Balance
        System.out.println(acc1.isMinimumBalanceMaintained());
        System.out.println();

        // Interest
        System.out.println("Interest = " + acc1.calculateInterest());
        System.out.println();

        // Close Account
        System.out.println(acc1.closeAccount());

    }
}
