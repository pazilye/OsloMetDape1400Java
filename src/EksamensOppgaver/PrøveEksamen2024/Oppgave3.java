package EksamensOppgaver.PrøveEksamen2024;

public class Oppgave3 {

    public static char [] charArray (char[] arr){

        char [] result = new char[arr.length];
        int j=0;

        for (int i = arr.length-1 ; i >=0; i--) {
            result[j++]=arr[i];

        }

        return result;


        }







    }


/*
Create a static method that takes a char array as a parameter. The method must return a char-array where the elements in the array have the opposite
order compared to the char-array the method receives as a parameter. De- cide for yourself whether the method should be public or private. Explain the consequences of whether you choose private or public.
 */
