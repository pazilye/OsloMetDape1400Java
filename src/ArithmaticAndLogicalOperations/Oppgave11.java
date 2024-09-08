package ArithmaticAndLogicalOperations;

import java.util.Scanner;

public class Oppgave11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number between 0 and 1000");
        int number = scanner.nextInt();

        if ( number <0 || number > 1000 ) {
            System.out.println("Invalid number");
        }

        int n1 = number %10;
        number = number / 10;

        int n2 = number % 10;
        number = number / 10;

        int n3 = number % 10;

        int sumOfThree = n1 + n2 + n3;

        System.out.println(sumOfThree);







    }
}

/*
Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet (tverrsummen). F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13. Tips: 751 % 10 = 1 og 751 / 10 = 75.
 */
