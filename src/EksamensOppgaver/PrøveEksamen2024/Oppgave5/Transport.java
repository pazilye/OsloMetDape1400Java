package EksamensOppgaver.PrøveEksamen2024.Oppgave5;

public interface Transport {

    double calculatoeCost(int distance);

    int calculateTime(int distance,int minutesTilNextTransport);
}
