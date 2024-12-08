package EksamensOppgaver.PrøveEksamen2024.Oppgave5;

public class Taxi implements Transport {

    public double cost;
    public int distance;


    @Override
    public double calculatoeCost(int distance) {

        return 0.05 * distance +50;

    }

    @Override
    public int calculateTime(int distance, int minutesTilNextTransport) {

        // taxi takes 1 minut per 1000 meters

        // time calculation : 0.1 minutes per 1000 meters

        int travelTime = (int) (distance / 1000.0 * 0.1 );
        return travelTime + minutesTilNextTransport;
    }
}
