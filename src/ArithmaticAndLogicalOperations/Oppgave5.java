package ArithmaticAndLogicalOperations;
import static javax.swing.JOptionPane.*;

public class Oppgave5 {
    public static void main(String[] args) {

        String fahrenheit;


        fahrenheit = showInputDialog("Write a random fahrenheit degree");
        double fahrenheitDouble = Double.parseDouble(fahrenheit);

        double celcius = (fahrenheitDouble - 32) /1.8;

        showMessageDialog(null, "Celcius: " + celcius);





    }
}

/*
Lag et program som regner om fra fahrenheit til celsius. Les inn verdien for fahrenheit og regn ut tilsvarende celsius med følgende formel: C = (F-32)/1.8. Skriv så ut resultatet i Celsius.
 */
