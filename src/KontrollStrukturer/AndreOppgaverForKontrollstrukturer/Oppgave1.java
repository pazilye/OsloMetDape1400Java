package KontrollStrukturer.AndreOppgaverForKontrollstrukturer;
import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args) {



        while (true){
            double lengdenPåTuren = Double.parseDouble(showInputDialog("Skriv inn lengden på turen"));

            if(lengdenPåTuren <= 0){
                showMessageDialog(null,"Lengdin på turen må være større enn 0");
                System.exit(0);
            }

            double bensinBleBrukt = Double.parseDouble(showInputDialog("Skriv inn bensin ble brukt"));





            double bensinBleBruktPerMil = lengdenPåTuren / bensinBleBrukt;
            showMessageDialog(null,"Bensin ble brukt per mil er " + bensinBleBruktPerMil);
        }









    }
}

/*
Oppgave 1
Lag et program som regner ut hvor mye en bil bruker i bensin på ulike turer. Programmet skal lese inn to og to verdier, lengden på turen i km og hvor mye bensin som ble brukt. Les inn ved hjelp av inputbokser (JOptionPane). Når lengden på turen er 0 eller negativ avsluttes innlesningen og det skrives ut hvor mye gjennomsnittlig bensin bilen har brukt pr mil.
 */