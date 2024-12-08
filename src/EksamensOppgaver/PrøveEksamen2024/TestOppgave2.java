package EksamensOppgaver.PrøveEksamen2024;

import java.util.Scanner;

public class TestOppgave2 {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter 1-3 to choose todays menu");
            System.out.println("1. Display word of wisdom");
            System.out.println("2. Display weather");
            System.out.println("3. Exit the program");
            System.out.println();

            System.out.println("Please choose one of the three options, only numbers allowed");
            String userInput = scanner.nextLine();


            switch (userInput) {
                case "1":
                    Oppgave2.displayWordOfWisdom();
                    break;
                case "2":
                    Oppgave2.displayWeather();
                    break;
                case "3":
                    System.out.println("You chose to exit the program. bye");
                    Oppgave2.exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice, please enter 1,2 or 3");

                    System.out.println();

                    scanner.close();

            }


        }


    }

}


