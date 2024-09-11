package ClassesAndObjects1.BookTask;
import static javax.swing.JOptionPane.*;

public class Books {

    public String title,author,iSBN;
    public int price;

    public String printOutBook(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("ISBN: "+iSBN);
        return null;
    }

    public void showMessage(){
        String out= "Here is the book information :\n" + "Title :" +title + "\n" + "Author :" +author + "\n" + "ISBN :" +iSBN + "\n";
        showMessageDialog(null,out);

    }













}

/*
Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:

tittel
pris
forfatter
iSBN-nummer
Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.

Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier. Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.


Oppgave 2
Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks
 */