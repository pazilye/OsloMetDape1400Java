package EksamensOppgaver.Eksamen2023.Oppgave4;

public class Student {

    private String name;
    private String studNr;

    public Student(String name, String studNr) {
        this.name = name;
        this.studNr = studNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudNr() {
        return studNr;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }


    @Override
    public String toString() {
        return "Student : name= " + name + ", StudentNR =" +studNr;
    }
}
