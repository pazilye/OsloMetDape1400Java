package EksamensOppgaver.Eksamen2023.Oppgave5;
import java.util.ArrayList;


public class Publisher {
    public static void main(String[] args) {

        PaperBok paperBok = new PaperBok("Book lovers","Emily henry",189,324234242);

        LydBok lydBok = new LydBok("Yellow face","F.Kuang",190,430);



        ArrayList<Bok> bokList = new ArrayList();
        bokList.add(paperBok);
        bokList.add(lydBok);

        System.out.println();

        for (Bok each : bokList) {
            System.out.println(each);
        }








    }
}
