package EksamensOppgaver.Eksamen2023;

public class Oppgave1 {
    public static void main(String[] args) {

        int [] intArray = {-3,41,5,-3,2,49};

        //a) Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
        int count =0 ;
        for (int each : intArray) {
            if(each >10){
               count++;

            }

        }

        System.out.println(count);

        //b) Skriv ut annethvert element

        for (int i =0; i < intArray.length; i+=2) {
         System.out.println(intArray[i] + " ");

        }

        //c) Skriv ut summen av alle positive tall i arrayet

        int total =0;
        for (int each : intArray) {
            total+=each;
        }

        System.out.println(total);


        //d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
        //Bruk løkker og System.out for å skrive ut.

        int gjennomsnitt = total/ intArray.length;
        System.out.println(gjennomsnitt);










    }
}

/*
Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:
a) Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
b) Skriv ut annethvert element
c) Skriv ut summen av alle positive tall i arrayet
d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
Bruk løkker og System.out for å skrive ut.
 */
