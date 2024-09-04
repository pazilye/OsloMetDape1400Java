package Variabler1;
import javax.swing.*;

public class Oppgave1 {

    public static void main(String[] args) {

       /*
        Oppgave 1

Lag et program som leser inn en persons fornavn og etternavn hver for seg (altså i to forskjellige input-bokser), skjøter dem sammen, og skriver det fullstendige navnet ut igjen som del av en passende tekst i en meldingsboks. Bruk passende ledetekster ved innlesing, slik at brukeren forstår hva som skal skrives inn.

        */


        String innFirstName =JOptionPane.showInputDialog("Enter your name");
        String innLastName =JOptionPane.showInputDialog("Enter your last name");

        JOptionPane.showMessageDialog(null,"the name is " + innFirstName+" "+innLastName);



        /*
        Oppgave 2

        Utvid oppgave 1 med å lese inn alderen.  Programmet skal så vise følgende i meldingsboksen (f.eks inndata):  ”Alderen til Ole Olsen er 21 år.”
         */

        String whatIsUrAge;
        whatIsUrAge= JOptionPane.showInputDialog("What is your age");
        JOptionPane.showMessageDialog(null,"Paziliyas age is " +whatIsUrAge+ ".");

        /*
        Oppgave 3

        Utvid oppgave 2 med adresse, poststed og postnr. Les inn dataene i flere inputbox'er og skriv det ut i en setning f.eks : Ole Olsen bor i Osloveien 23 som har postnummer 0470 i Oslo. Ole’s alder er 21 år.
         */

        String innAddress=JOptionPane.showInputDialog("Enter your address");
        String innPoststed = JOptionPane.showInputDialog("Enter your poststed");
        String innPostNr = JOptionPane.showInputDialog("Enter your postNr");

        JOptionPane.showMessageDialog(null,innFirstName+" bor i " + innAddress + " som har postnummer " +innPostNr+ " i " + innPoststed+"." +innFirstName+"´s alder er " +whatIsUrAge);

        /*

         Oppgave 4

        Endre oppgave 3 slik at det vises følgende i meldingsboksen (f.eks inndata):

        Navn : Ole Olsen
        Adresse : Osloveien 23
        Postnummer : 0470
        Poststed : Oslo
        Alder : 21 år.

                Tips: bruk \n for å få ny linje
         */

        String out="Navn: "+innFirstName+"\n" + "Adresse:" +innAddress+"\n"+"PostNummer:"+innPostNr+"\n"+"Poststed:"+innPoststed+"\n"+"Alder:"+whatIsUrAge;

        JOptionPane.showMessageDialog(null,out);

        /*
        Oppgave 5

        Endre oppgave 4 slik at utskriften ikke kommer i en meldingsboks, men i System.out.
         */

        System.out.println("Navn: "+innFirstName+"\n" + "Adresse:" +innAddress+"\n"+"PostNummer:"+innPostNr+"\n"+"Poststed:"+innPoststed+"\n"+"Alder:"+whatIsUrAge);

    }
}
