package ArithmaticAndLogicalOperations;
import java.util.Scanner;

public class Oppgave6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in US dollar");
        int usDollar = scanner.nextInt();

        double norwegianKroner = usDollar  * 10.72;

        System.out.println(norwegianKroner + " kroner ");

        scanner.close();





    }
}

/*
Lag et program som leser inn et beløp i amerikanske dollar (USD) og regner om og skriver ut tilsvarende beløp i norske kroner. Benytt dagens valutakurs fra nettet.
 */
