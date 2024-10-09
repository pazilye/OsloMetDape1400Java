package Arrays;

public class Oppgave2 {

    public static void main(String[] args) {

        int [] arrayOfNum = {1,2,3,4,5,6,7,8,9};
        int sum=0;

        for (int i = 0; i < arrayOfNum.length; i++) {
            sum+=arrayOfNum[i];

        }

        System.out.println("Summen av alle tallene i Array er " + sum);

        int gjennomsnitt= sum / arrayOfNum.length;
        System.out.println("Gjennomsnittet av tallene i Array er :" + gjennomsnitt);


        int sumAvTallSomErStørreEnn5 =0;
        for (int i = 0; i < arrayOfNum.length; i++) {
            if(i >= 5){
                sumAvTallSomErStørreEnn5+=arrayOfNum[i];
            }

        }

        System.out.println("Summen av alle tallene som er større enn 5 er :" + sumAvTallSomErStørreEnn5);

       int gjnnomsnittAvTallSomErStørreEnn5= sum / arrayOfNum.length;
        System.out.println("Gjennom snittet av tallene som er større enn 5 i Array er :" + gjnnomsnittAvTallSomErStørreEnn5);


        int sumNy=0;
        for (int each : arrayOfNum) {
            sumNy+=each;
        }

        System.out.println("Summen av alle tallene i Array er :" + sumNy);








    }
}

/*
Oppgave 2
Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke. Finn så gjennomsnittet av alle tallene. Summer så alle tallene som er større enn 5. Finn så gjennomsnittet av disse. Summer så tallene med en forenklet for-løkke.
 */
