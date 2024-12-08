package EksamensOppgaver.PrøveEksamen2024.Oppgave5;

public class Train implements Transport {

    double cost;
    int distance;


    @Override
    public double calculatoeCost(int distance) {

        return 0.01 *distance;


    }

    @Override
    public int calculateTime(int distance, int minutesTilNextTransport) {
       // train takes 0.5 minutes per 1000 meters

        // time calculation : 0.5 minutes per 1000 meters

        int travelTime = (int) ( distance / 1000.0 *0.5);
        return travelTime + minutesTilNextTransport;
    }
}
