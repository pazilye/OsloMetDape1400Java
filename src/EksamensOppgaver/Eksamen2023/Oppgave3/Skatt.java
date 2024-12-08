package EksamensOppgaver.Eksamen2023.Oppgave3;

public class Skatt {

    public String navn;
    public String adresse;
    public double salary;
    public double skatt;

    public Skatt(String navn, double salary, String adresse) {
        this.navn = navn;
        this.skatt = 0.0;
        this.salary = salary;
        this.adresse = adresse;
    }

    protected void prøvberegneSkatt (){

        if(salary >150000){
            skatt = salary * 0.35;
        }else if(salary >= 50000){
            skatt = salary * 0.25;
        }else{
            System.out.println("No need to pay tax");
        }
    }


    @Override
    public String toString() {
        return navn + "," +adresse +"\nsalary: " +salary +" Skatt: " +skatt;

    }
}
