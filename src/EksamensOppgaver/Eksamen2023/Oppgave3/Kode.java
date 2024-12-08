package EksamensOppgaver.Eksamen2023.Oppgave3;

public class Kode {
    public static void main(String[] args) {

        Skatt person = new Skatt("Per Hansen",400000.0,"Osloveien 82 0150 Oslo");

        person.prøvberegneSkatt();

        System.out.println(person);







    }
}
