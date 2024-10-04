package KontrollStrukturer.OppgaverMedIfOgSwitch;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave3 {

    public static void main(String[] args){

        int alder= Integer.parseInt(showInputDialog("Skriv inn ditt alder"));
        if(alder >=18){
            showMessageDialog(null,"Du kan ta førerkortet for bil da du er gammel nok");
        } else if (alder <18) {
            showMessageDialog(null,"Du er for ung til å ta førerkort for bil");
        }

        }

    }

/*
Oppgave 3
Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).
 */
