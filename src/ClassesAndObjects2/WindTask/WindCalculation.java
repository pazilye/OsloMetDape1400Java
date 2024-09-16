package ClassesAndObjects2.WindTask;
import static javax.swing.JOptionPane.*;

public class WindCalculation {
    public static void main(String[] args) {

      //  Wind wind =  new Wind(25); // This is how we normally use or build up a constructor

        // but if we want to use javax.swing we need to do it as below

        String innVind =showInputDialog("Please prove the wind speed");
        double wind = Double.parseDouble(innVind);
        Wind checkTheWind = new Wind(wind);

        String out = "Wind speed is : " + checkTheWind.getVindhastighet() + "\n";
                if(checkTheWind.erOrkan()){
                    out+="It is Orkan";
                } if(checkTheWind.erVindstille()){
                    out+="It is Vindstille";
        }
                String knop = String.format("%.2f",checkTheWind.getKnop());
                out+= "It is " +knop +" knop. \n";
                out+="And its equivalent to :"+checkTheWind.getBeaufort() + " according to the Beaufort scale";
                showMessageDialog(null,out);


    }
}
