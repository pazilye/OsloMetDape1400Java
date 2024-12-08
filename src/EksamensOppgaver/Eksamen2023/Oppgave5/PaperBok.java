package EksamensOppgaver.Eksamen2023.Oppgave5;

public class PaperBok extends Bok{

    private int ISBN;

    public PaperBok(String title, String author, double price, int ISBN) {
        super(title, author, price);
        this.ISBN= ISBN;
    }


    @Override
    public String toString() {
        return "PaperBok : " + "ISBN : " + ISBN +super.toString();
    }
}
