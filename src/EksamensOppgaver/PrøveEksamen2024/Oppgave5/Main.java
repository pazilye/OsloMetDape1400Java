package EksamensOppgaver.PrøveEksamen2024.Oppgave5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // instances of train and taxi classes

        Transport train = new Train();
        Transport taxi = new Taxi();

        // add them to a list of Transport

        List<Transport> transports = new ArrayList<>();
        transports.add(taxi);
        transports.add(train);

        int [] distances = {1000,5000,50000};

        for (int distance : distances) {
            System.out.println(" distances " +distance +" meters");
            System.out.println("cost for taxi : " +taxi.calculatoeCost(distance) +"\n" +"cost for train: " + train.calculatoeCost(distance));
            System.out.println("Time for taxi:" + taxi.calculateTime(distance,5) +"\n" + "Time for train : " +train.calculateTime(distance,30 ));

        }







    }
}
