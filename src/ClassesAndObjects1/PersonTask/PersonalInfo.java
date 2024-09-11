package ClassesAndObjects1.PersonTask;
import static javax.swing.JOptionPane.*;

public class PersonalInfo {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "John Doe";
        person2.name = "Jane Doe";

        person1.address = "Oslo Veien 82";
        person2.address = "Oslo Veien 81";

        person1.birthYear = 1990;

        person1.phoneNumber=94850393;
        person2.phoneNumber=94850329;

        System.out.println(person1.calculateAge());

        System.out.println(person2.personalInformation(4));

        // gen in data

        String name= showInputDialog("Write your name");
        String address= showInputDialog("Write your address");
        int phoneNumber=Integer.parseInt(showInputDialog("Write your phone number"));
        int birthYear=Integer.parseInt(showInputDialog("Write your birth year"));

        // create personal info

        person1.name = name;
        person1.address = address;
        person2.phoneNumber = phoneNumber;
        person2.birthYear = birthYear;

        showMessageDialog(null,person1.showPersonalInfo());








    }
}
