package EksamensOppgaver.Eksamen2023.Oppgave4;

public class Fag {

    private String name;
    private String year;
    private Student[] students;


    public Fag(String year, String name, Student[] students) {
        this.year = year;
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String out = "Fag: " + name + ", year" +year+ "\n";
        for (Student eachStudent : students){
            if(eachStudent != null){
                out+=eachStudent +"\n";
            }

        }

        return out;
    }
}



