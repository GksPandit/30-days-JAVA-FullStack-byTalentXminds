package Day11;

public class CashPayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("Payment of "+amount+" successful by cash.");
    }
}
