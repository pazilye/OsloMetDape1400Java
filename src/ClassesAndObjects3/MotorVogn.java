package ClassesAndObjects3;

public class MotorVogn {
    public static void main(String[] args) {

        // opprett et array av Biler

        Oppgave.Bil[] register = new Oppgave.Bil[3];

        Oppgave.Dato dato1 = new Oppgave.Dato(2,3,2022);
        Oppgave.Bil volvo = new Oppgave.Bil("Volvo T5", dato1 ,"DP23456");

        Oppgave.Dato dato2 = new Oppgave.Dato(4,10,2020);
        Oppgave.Bil audi = new Oppgave.Bil("Audi R8",dato2,"DR45678");

        register[0] = audi;
        register[1] = volvo;

        for (Oppgave.Bil each : register) {
            if(each != null) {
                System.out.println(each);
            }
        }



    }
}
