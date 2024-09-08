package ArithmaticAndLogicalOperations;

import java.util.Scanner;

public class Oppgave3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the length of the rectangle");
        int lengthOfRectangle = scanner.nextInt();

        System.out.println("Write the width of the rectangle");
        int widthOfRectangle = scanner.nextInt();

        int arealOfRectangle = lengthOfRectangle * widthOfRectangle;

        System.out.println("A rectangle with width of " +widthOfRectangle + " cm and length of " +lengthOfRectangle + " cm has its areal of " +arealOfRectangle + " cm^2.");

        scanner.close();




    }
}

/*
Lag et program som regner ut arealet av et rektangel. Programmet skal lese inn lengden og bredden på rektangelet.  Regn så ut  arealet og skriver ut svaret på følgende måte: ”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”.

 */
