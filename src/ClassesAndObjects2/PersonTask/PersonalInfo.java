package ClassesAndObjects2.PersonTask;
import static javax.swing.JOptionPane.*;

public class PersonalInfo {
    public static void main(String[] args) {

        Person person=new Person("Paziliya","Jurat","Oslo Veien",96496059);

        showMessageDialog(null,person.printInfo());

    }
}
