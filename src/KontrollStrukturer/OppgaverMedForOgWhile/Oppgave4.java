package KontrollStrukturer.OppgaverMedForOgWhile;

public class Oppgave4 {

    public static void main(String[] args) {

        int sum=0;
        int count =0;


        for (int i = 0; i < 100; i++) {
            if( i % 2 == 0){
                sum+=i;
                count++;

            }



        }
        double gjennomsnitt = sum/count;

        System.out.println(gjennomsnitt);



    }
}

/*
Oppgave 4
Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)
 */
