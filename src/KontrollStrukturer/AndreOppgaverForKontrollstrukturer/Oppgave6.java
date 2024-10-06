package KontrollStrukturer.AndreOppgaverForKontrollstrukturer;

public class Oppgave6 {
    public static void main(String[] args) {


        System.out.println("N\tN^2\tN^3\tN^4");

        for (int i = 1; i <= 10; i++) {
            // Beregn N^2, N^3, og N^4 ved å bruke Math.pow()
            int N2 = (int) Math.pow(i, 2); // N^2
            int N3 = (int) Math.pow(i, 3); // N^3
            int N4 = (int) Math.pow(i, 4); // N^4

            System.out.println(i + "\t" + N2 + "\t" + N3 + "\t" + N4);
    }
}

}

/*
Oppgave 6
Lag et program som viser følgene ut (med tab):

N       N^2       N^3        N^4
1            1           1             1
2            4           8             16
3            9           27           81

..... frem til N=10.

Bruk gjerne metoden i Java : MATH.pow(grunntall, eksponent).
 */
