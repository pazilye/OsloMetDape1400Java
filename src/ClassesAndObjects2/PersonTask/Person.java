package ClassesAndObjects2.PersonTask;
import static javax.swing.JOptionPane.*;


public class Person {

    String firstName,lastName,address;
    int phoneNumber;

    public Person(String firstName, String lastName, String address, int phoneNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printInfo(){
        String out = getFirstName() +"\n"+getLastName() +"\n"+getAddress() +"\n"+getPhoneNumber() +"\n";
        showMessageDialog(null,out);
    }


}


/*
Lag en klasse «Person» med følgende private attributter:

fornavn
etternavn
adresse
telefonnr
Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.

Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.

Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.
 */