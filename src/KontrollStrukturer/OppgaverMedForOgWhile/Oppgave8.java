package KontrollStrukturer.OppgaverMedForOgWhile;

public class Oppgave8 {

    public static void main(String[] args) {

        int i = 0;
        int sum =0;
        int count =0;

        while (i <100){
            if( i % 2 == 0){
                sum+=i;
                count++;

            }




        }

        double gjennomsnitt = sum / count;

        System.out.println(gjennomsnitt);




    }
}

/*
Oppgave 8
Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).

Finn også gjennomsnittet.
 */
