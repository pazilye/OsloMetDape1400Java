package KontrollStrukturer.AndreOppgaverForKontrollstrukturer;
import static javax.swing.JOptionPane.*;

public class Oppgave9 {
    public static void main(String[] args) {

        int number = Integer.parseInt(showInputDialog("Enter for which number you want to calculate the factorial number for "));
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result *= i;
        }

        showMessageDialog(null, "Factorial of " + number + " is " + result);




    }
}

/*
Oppgave 9
Skriv et program som regner ut fakultet til et tall. n! = n*(n-1)*(n-2)*...*1.

F. eks 5! = 5*4*3*2*1 = 120

Programmet skal lese inn tallet og skrive ut resultatet.
 */
