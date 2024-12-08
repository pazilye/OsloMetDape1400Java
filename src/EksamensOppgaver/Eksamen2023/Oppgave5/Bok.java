package EksamensOppgaver.Eksamen2023.Oppgave5;

public class Bok {

    private String title,author;
    private double price;

    public Bok(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bok : " + "title : " + title +
                ", author : " + author + ", price :" + price ;
    }
}
