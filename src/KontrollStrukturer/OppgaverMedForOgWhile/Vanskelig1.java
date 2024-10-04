package KontrollStrukturer.OppgaverMedForOgWhile;

import java.util.Scanner;

public class Vanskelig1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number ");
        long numberOfRounds = scanner.nextLong();

        double pi= 0.0;

        for (int i = 0; i <numberOfRounds ; i++) {
            if(i % 2 == 0){
                pi += 4.0 / (2 * i + 1);
            }else {
                pi -= 4.0 / (2 * i + 1);
            }
            
        }

        System.out.println(pi);

        scanner.close();
        
        
    }
}

/*
Oppgave 1
Beregn Pi med 10 desimalers nøyaktighet. Pi med 12 desimaler er 3.14159265358. Bruk en løkke til å beregne pi ved hjelp av denne rekken:

Pi=4-4/3+4/5-4/7+4/9-4/11+....

Lag en innlesning av antall ledd i rekken (omganger i løkken) slik at det er mulig å variere hvor mange som trengs for å oppnå en presisjon på 10 siffer.

Tips: Bruk long isteden for int for å ha mulighet for stort nok tall i løkken.
 */
