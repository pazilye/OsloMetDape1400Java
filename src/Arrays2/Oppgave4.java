package Arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class Oppgave4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Integer [] numbers=list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(numbers));




    }
}

/*
Definer et ArrayList attay : 1,2,3,4,5,6,7,8,9. Skriv kode for å konvertere dette til et vanlig heltalls-array. Skriv så kode for å skrive ut det nye heltalls-arrayet
 */
