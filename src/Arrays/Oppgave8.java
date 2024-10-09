package Arrays;
import static javax.swing.JOptionPane.*;

public class Oppgave8 {
    public static void main(String[] args) {

        int antall, poeng;
        String innAntall,innPoeng;

        innAntall=showInputDialog("Hvor mange poengsummer skal leses inn ?");

        try {
            antall = Integer.parseInt(innAntall);

        }
        catch (NumberFormatException e) {
            showMessageDialog(null,"Feil, det ble ikke satt noe antall, avslutter!");
            antall=0;
        }

        int[] poengsum = new int[antall];

        while(antall > 0){
            innPoeng = showInputDialog("Skriv inn poengsum");

            try{
                poeng = Integer.parseInt(innPoeng);
                poengsum[antall-1] = poeng;
                antall--;
            }
            catch (Exception e) {
                showMessageDialog(null,"Feil i input av poengsum, trykk Enter");
            }


        }

        int sum=0;
        for (int each : poengsum) {
            sum+=each;
        }

        if(poengsum.length >0){
            double gjennomsnitt = (double) sum/poengsum.length;
            showMessageDialog(null,"Gjennomsnitt " + gjennomsnitt);

        }






    }
}

/*
Oppgave 8 (en litt vanskeligere oppgave)
Det skal lages et program som beregner gjennomsnittlig poengsummer for et antall elever - poengene er mellom 0 og 100.

Lag et program som først leser inn hvor mange poengsummer som skal leses inn. Så skal det opprettes et heltalls-array med riktig lengde (fra input). Deretter skal det leses inn poengsummer via en løkke samtidig som arrayet fylles. Tilslutt skal det via en løkke beregnes gjennomsnittlig poengsum også vise dette på skjermen. (Det er mulig å løse denne oppgaven enklere uten å bruke array, men oppgaven trener på bruk av arrays).

Bruk gjerne try/catch ved parsing av input og spør igjen om tall dersom det ikke er oppgitt riktig.
 */
