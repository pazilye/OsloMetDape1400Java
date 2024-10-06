package KontrollStrukturer.AndreOppgaverForKontrollstrukturer;
import static javax.swing.JOptionPane.*;

public class Oppgave8 {
    public static void main(String[] args) {

       while(true) {
           int num = Integer.parseInt(showInputDialog("Write a 5 digit number: "));

           if(num >=10000 && num <=99999){
               showMessageDialog(null,"We are calculating");
           }else{
               num = Integer.parseInt(showInputDialog("Write a 5 digit number: "));
           }

           int firstDigit = num / 10000;
           int secondDigit = (num / 1000) % 10;
           int fourthDigit = (num/ 10) % 10;
           int fifthDigit = num % 10;

           if(firstDigit == fifthDigit && secondDigit == fourthDigit){
               showMessageDialog(null,"It is Palindrome");
           }else{
               showMessageDialog(null,"It is not Palindrome");
           }

          String answer = showInputDialog("Do you want to continue? ");
           if(answer.equals("yes")){
               num = Integer.parseInt(showInputDialog("Write a 5 digit number: "));
           }else {
               showMessageDialog(null,"Ok,bye!");
               break;

           }

       }

    }
}

/*
Oppgave 8
Palindrom er en sekvens med tegn som kan leses likt begge veier. Feks. 12321 er et palindrom. Skriv et program som leser inn et 5 sifret heltall og avgjør om dette er et palindrom eller ikke. Dersom ikke tallet er 5 siffer, les inn tallet på nytt. Tips: Bruk heltallsdivisjon og modulus for å finne de ulike sifrene i tallet.
 */
