package ClassesAndObjects1.PersonTask;

public class Person {

    public String name,address;
    public int phoneNumber,birthYear;

    public int calculateAge(){
        int age=2024-birthYear;
        return age;
    }

    public String personalInformation(int age){
       return name + " with address : " + address + " and phone number : " + phoneNumber + " is : " + age + " years old";

    }

    public String showPersonalInfo(){
        String out= name + "\n" + address + "\n" + phoneNumber + "\n" + birthYear + "\n";
        return out;
    }







}

/*
Lag en klasse kalt Person. Denne skal inneholde følgende attributter:

navn
adresse
telefonnr
fødselsår
Lag en metode for å regne ut alderen til en person. Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår. Metoden skal returnere alderen.

Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:

Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.

Opprett et eller flere person objekter i main-metoden for å teste ut.


Oppgave 4
Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:

Navn: Per Hansen
Adresse : Osloveien 82
Telefonnr : 22124512
Alder : 21 år.

Tips: bruk \n for å få ny linje
 */
