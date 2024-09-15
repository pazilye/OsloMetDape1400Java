package ClassesAndObjects2.BensinTask;

public class BensinCalculator {
    public static void main(String[] args) {

        BensinPurchase bensinPurchase = new BensinPurchase("Ice","Diesel","2 mins",58.0,20.8);

        System.out.println(bensinPurchase.totalPrice());



    }
}
