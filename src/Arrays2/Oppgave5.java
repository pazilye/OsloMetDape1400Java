package Arrays2;

import java.util.Arrays;

public class Oppgave5 {
    public static void main(String[] args) {

        int [][] arr2D = {{4,7,6},{6,9,6},{2,4,3},{5,8,7}};
        System.out.println(Arrays.deepToString(arr2D));

        int sum = 0;

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                sum += arr2D[i][j];

            }
        }

        double avg = (double) sum / arr2D.length;
        System.out.println(avg);






    }
}

/*
Det er definert et to-dimensjonalt helttalls-array (se under). Hver rad tilsvarer en filmanmelders "score" av 4 filmer (kolonner).

4	6	2	5
7	9	4	8
6	9	3	7
Lag et program som beregner gjennomsnittlig "score" for de 4 forskjellige filmene og skriver ut resultatet.
 */
