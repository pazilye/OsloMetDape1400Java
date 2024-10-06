package KontrollStrukturer.AndreOppgaverForKontrollstrukturer;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main(String[] args) {

        while(true){

            for (int i = 1; i <=3 ; i++) {
                String navn= showInputDialog("Skriv inn navn til person");
                long inntekter= Long.parseLong(showInputDialog("Skriv inn inntekt til person"));

                if(inntekter < 0){
                    showMessageDialog(null,"inntekter kan ikke være mindre enn 0");
                    System.exit(0);


                    long skatt = (long) beregneSkatt(inntekter);


                showMessageDialog(null,"Denne person må betale skatt på " + skatt);








                }

            }


        }

    }

    public static double beregneSkatt(double inntekt){
        if ( inntekt<= 500000) {
            return inntekt * 0.30; // 30% tax for income up to 500,000
        } else {
            double tax = 500000 * 0.30; // Tax for first 500,000
            tax += (inntekt - 500000) * 0.50; // 50% tax for income over 500,000
            return tax;
        }
    }
}

/*
Oppgave 3
Lag et program som beregner skatten til tre personer. Skatten er 30 % frem til 500.000 kr og 50 % over. Les inn navn og inntekt på de 3 personene og vis den samme informasjonen med hvor mye skatt de kan forvente seg.


 */
