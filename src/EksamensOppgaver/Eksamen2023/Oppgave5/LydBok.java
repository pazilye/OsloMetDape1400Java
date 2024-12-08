package EksamensOppgaver.Eksamen2023.Oppgave5;

public class LydBok extends Bok{

    private int lengthOfMinutes;

    public LydBok(String title, String author, double price, int lengthOfMinutes) {
        super(title, author, price);
        this.lengthOfMinutes = lengthOfMinutes;
    }

    @Override
    public String toString() {
        return "LydBok: " + " lengthOfMinutes : " + lengthOfMinutes + super.toString();
    }
}
