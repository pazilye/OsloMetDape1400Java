package ArithmaticAndLogicalOperations;

import java.util.Scanner;

public class Oppgave4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the radius of the circle");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;


        // below we are rounding the decimals to two by using String.format method
        String circumferenceWithTwoDecimals = String.format("%.2f",circumference);




        System.out.println("The circumference of the circle is " + circumferenceWithTwoDecimals);

        scanner.close();







    }
}

/*
Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen. Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte: ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”

Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f" , omkretsen); for å få 2 desimaler.
 */

