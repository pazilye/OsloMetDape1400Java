package KontrollStrukturer.OppgaverMedIfOgSwitch;

public class Oppgave5 {

    public static void main(String[] args) {

        String månedsNavn = "Juni";
        String result = "";
       switch (månedsNavn){
           case "Juni":
           case "Juli":
           case "August":
           result=("Det er sommer");
                break;
           case "September":
           case "Oktober":
           case "November":
           result=("Det er høst");
               break;
           case "Desember":
           case"Januar":
           case"Februar":
           result=("Det er vinter");
               break;
           case"Mars":
           case"April":
           case"Mai":
               result=("Det er vår");
               break;
           default:
               result=("Ugyldig måned");


       }

        System.out.println(result);




    }
}

/*
Oppgave 5
Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,
a) Lag først et program som løser det med if /else

b) Lag deretter et program som løser det med bruk av switch.
 */
