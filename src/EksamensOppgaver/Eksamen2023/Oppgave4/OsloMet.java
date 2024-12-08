package EksamensOppgaver.Eksamen2023.Oppgave4;

public class OsloMet {
    public static void main(String[] args) {

        Student [] students = new Student[10];

        Student kari = new Student("Kari Olsen","S234556");
        Student Ole = new Student("Ole Hansen","S356734");

        students[0]=kari;
        students[1]=Ole;

        Fag programmering = new Fag("2020","Programmering",students);

        System.out.println(programmering);






    }
}
