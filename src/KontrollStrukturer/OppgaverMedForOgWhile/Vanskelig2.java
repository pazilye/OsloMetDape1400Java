package KontrollStrukturer.OppgaverMedForOgWhile;

public class Vanskelig2 {
    public static void main(String[] args) {


        ;
        int limit = 40;
        for (int i = 0; i <= limit; i++) {
            if(isPrimeNumber(i)){
                System.out.println(i + " ");
            }


        }



    }




    public static boolean isPrimeNumber(int number){

        for (int i = 2; i <number ; i++) {
            if(number % i == 0){
                return false;
            }



        }

        return true;
    }


}

/*
Oppgave 2
Lag en primtallsgenerator. Det vil si liste ut alle primtall fra 0 og opp til et valgt tall. Et primtall er et tall som bare er delelig med 1 og seg selv.
 */
