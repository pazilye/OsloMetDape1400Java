package EksamensOppgaver.Eksamen2023.Oppgave2;

public class Liste {

    //1) Tar et heltallsarray inn og returnerer hvor mange elementer som er større enn null

    public static int countElements (int [] arr){

        int count =0;

        for (int each : arr) {
            if(each > 0){
                count++;
            }
        }

                return count;

    }


    //2) Tar et heltallsarray inn og finner ut hvor mange ganger et bestemt tall forekommer (tallet
    //skalogså inn i metoden)

    public static int frequencyOfElement (int [] arr, int tall){

        int count=0;

        for (int each : arr) {
            if(each==tall){
                count++;
            }
        }

        return count;


    }

    //3) Tar et heltallsarray inn og finner det største tallet i arrayet

    public static int biggestNum (int[] arr){

        int max=0;

        for (int each : arr) {
            if(each>max){
                max=each;
            }
        }

        return max;

    }
}








/*
2 Oppgave 2 (20%)
Lag en klasse kalt Liste for å behandle arrays.
Lag følgende statiske metoder i denne klassen som behandler arrays:
1) Tar et heltallsarray inn og returnerer hvor mange elementer som er større enn null
2) Tar et heltallsarray inn og finner ut hvor mange ganger et bestemt tall forekommer (tallet
skalogså inn i metoden)
3) Tar et heltallsarray inn og finner det største tallet i arrayet
Til slutt skriv kode i main-metoden for å kalle de ulike metodene med et heltallsarray
Resultatet skal skrives ut på System.out.
Kode for main:
public static void main(String[] args) {
}
 */
