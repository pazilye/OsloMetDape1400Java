package ClassesAndObjects2.BensinTask;

public class BensinCalculator {
    public static void main(String[] args) {

        BensinPurchase bensinPurchase = new BensinPurchase("Ice","Diesel","12:30",58.0,20.8);

        double price = bensinPurchase.totalPrice();

        String priceTwoDecimal = String.format("%.2f", price);
        String out = "It costs $ " + priceTwoDecimal+ " at : " + bensinPurchase.getBensinStation() + " at :" + bensinPurchase.getTimeFilled();

        System.out.println(out);



    }
}
