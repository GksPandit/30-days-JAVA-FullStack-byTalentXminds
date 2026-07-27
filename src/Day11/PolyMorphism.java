package Day11;

public class PolyMorphism {

    static void main(int a){

    }
    static void main(){
        Payment p;

        //want upi payment
        p = new UPIPayment();
        p.i = 199;
        p.pay(1000);

        //want cash payment
        p = new CardPayment();
        p.pay(1600);
    }
}
