package Variabler2;
import java.util.InputMismatchException;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

public class Oppgave {

    public static void main(String[] args) {

        /*
        Oppgave 1

Lag et program som leser inn alderen din (et heltall). Vis så denne i en meldingsbox sammen med en tekst f.eks som ”Min alder er 19 år.”
    ±
         */

        String innAlder= showInputDialog("Skriv inn ditt alder");
        int alder= Integer.parseInt(innAlder);
        showMessageDialog(null,"min alder er " + alder + " år.");

/*
Oppgave 2

Lag et program som leser inn tre desimaltall. Programmet skal så summere disse tallene og vise summen i System.out.

 */
        /*
         Oppgave 4 (litt vanskeligere)

        Endre på programmet i oppgave 3 slik at du sikrer at det skrives inn tall og ikke vanlig tekst i input-boksene. Bruk try og catch for å få dette til. Dersom det ikke skrives inn tall sett input til 0.

                */
        double number1;
        double number2;
        double number3;

       try {

           System.out.println("Write a number");
           Scanner scanner= new Scanner(System.in);
           number1 = scanner.nextDouble();

           System.out.println("Write another number");
           number2 = scanner.nextDouble();

           System.out.println("Write another number");
           number3 = scanner.nextDouble();

           System.out.println("sum of three numbers = " + number1 + number2 + number3);
           System.out.println("averageOfThreeNumbers = " + number1 + number2 + number3 / 3);

       }
       catch (Exception e){
           number1=0;
           System.out.println(e);
       }

        System.out.println("Numbers are  = " + number1);

       }
       }


