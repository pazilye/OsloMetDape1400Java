package Arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class Oppgave2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        
        list.add(10);
        list.add(11);
        
        list.remove(1);
        list.remove(1);


        for (Integer each : list) {
            System.out.println(each);
        }

        System.out.println("list.size= " + list.size());



    }
}

/*
Bruk samme array som i oppgave 1. Legg til tallene 10 og 11 i arrayet. Slett så elementene med tallene 2 og 3. Skriv så ut hele arrayet med en for-løkke. Bruk size() for å finne lengden i arrayet.
 */
