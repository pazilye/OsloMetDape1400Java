package ArithmaticAndLogicalOperations;

import java.util.Scanner;

public class Oppgave10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your age");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for the drivers licesne");
        }else if(age <= 18) {
            System.out.println("You are not eligible for the drivers licesne");
        }

        scanner.close();














    }
}

/*
Lag et program som leser inn et heltall, alder. Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende : ”Du kan ta førerkortet for bil da du er gammel nok” eller ”Du er for ung til å ta førerkort for bil”. Gjør dette ved bruk to if-setninger.

 */
