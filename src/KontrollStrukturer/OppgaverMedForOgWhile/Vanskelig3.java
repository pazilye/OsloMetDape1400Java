package KontrollStrukturer.OppgaverMedForOgWhile;

import java.util.Scanner;

public class Vanskelig3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of numbers to check if there are prime numbers included in the list ");
        int limit = scanner.nextInt();


        for (int i = 0; i <=limit; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i + " ");
            }

        }






    }

    public static boolean isPrimeNumber (int number){

        for (int i = 2; i <number ; i++) {
            if (number % i == 0) {
                return false;
            }

        }

        return true;
    }
}

/*
Oppgave 3
Lag en primtallssjekk. Et tall oppgis og det sjekkes om dette tallet er delelig med alle tall fra 1 og opp til det valgte tallet. Dersom det er delelig bare med 1 og seg selv er det et primtall.
 */
