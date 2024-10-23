package Arrays2;
import static javax.swing.JOptionPane.*;


public class Oppgave6 {
    public static void main(String[] args) {

        int antallRaw, antallColumns;

        String innRaw = showInputDialog("How many books ?");

        try{
            antallRaw = Integer.parseInt(innRaw);
        }catch(Exception e){
            antallRaw = 0;
        }

        String innColumns = showInputDialog("How many columns ?");

        try{
            antallColumns = Integer.parseInt(innColumns);
        }catch (Exception e){
            antallColumns = 0;
        }

        String ut ="";







        







    }
}

/*
Utvid oppgave 6 til også å lese inn matrisen (det to-dimensjonale arrayet) fra brukeren. Først skal man kunne lese inn antall anmeldere (rader) og antall filmer (kolonner). Så skal arrayet defineres og man skal lese inn "scores".

Bruk gjerne try/catch for å sikre at man leser inn korrekte tall. Sjekk også om tallene er mellom 0 og 9.
 */
