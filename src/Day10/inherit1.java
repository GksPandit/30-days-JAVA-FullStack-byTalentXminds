package Day10;

import Day11.CashPayment;
import Day11.Payment;
public class inherit1 {

     public static void main(String[] args) {
        CollegeStudent std1 = new CollegeStudent("Jain College", 123456.00f, "Nikhil", 24);
        std1.admission();
        Student schStd1 = new SchoolStudent("dps", 21343, "Rahul", 17);
//        System.out.println(schStd1.toString());
        schStd1.admission();
        Payment p = new CashPayment();
        p.pay(100);
    }
}
