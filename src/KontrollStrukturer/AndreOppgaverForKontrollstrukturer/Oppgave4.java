package KontrollStrukturer.AndreOppgaverForKontrollstrukturer;
import static javax.swing.JOptionPane.*;

public class Oppgave4 {
    public static void main(String[] args) {


        int biggestNum = 0;
        
        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(showInputDialog("Write a number"));
            if (num > biggestNum) {
                biggestNum = num;
            }


            }

        showMessageDialog(null,"The biggest number is " +biggestNum);
        }

    }

/*
Oppgave 4
Et program skal finne det største tallet av 10 heltall. Tallene skal leses inn via Inputbokser og vises som en meldingsboks. Programmet skal bruke tre heltallsvariabler:

telller; som teller 0 til 10
nummer; som er tallet som er lest inn
størst; det til en hver tid største tallet
 */
