package KontrollStrukturer.AndreOppgaverForKontrollstrukturer;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {

    public static void main(String[] args) {

        while(true) {

            double vanligMånedslønn = 0;
            double lønnEtterKommission = 0;

            double pris = Double.parseDouble(showInputDialog("Prisen på varen er : "));

            if(pris <= 0 ) {
                showMessageDialog(null,"Prisen kan ikke være 0");
                System.exit(0);

            }
            int antallVarer = Integer.parseInt(showInputDialog("Antall varen : "));

            vanligMånedslønn = antallVarer * pris;
            lønnEtterKommission += vanligMånedslønn * 0.09 + vanligMånedslønn;



            showMessageDialog(null,"Lønn etter kommission blir " + lønnEtterKommission);







        }








    }
}

/*
Oppgave 2
En salgsperson får kommisjon av salget sitt. Det betyr at vedkommende får 9 % av salget i tillegg til vanlig månedslønn. Skriv et program som leser prisen på et antall varer selgeren har solgt og regn ut hvor mye tillegg vedkommende er berettiget til. Bruk inputbokser og avslutt innlesningen når prisen er 0.
 */
