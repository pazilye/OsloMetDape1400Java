package KontrollStrukturer.AndreOppgaverForKontrollstrukturer;
import static javax.swing.JOptionPane.*;

public class Oppgave5 {
    public static void main(String[] args) {

        int biggestNum1=0;
        int biggestNum2=0;

        for (int i = 1; i <10 ; i++) {
            int num= Integer.parseInt(showInputDialog("Enter 10 numbers"));
            if(num>biggestNum1){
                biggestNum1=num;
            }else if(num>biggestNum2){
                biggestNum2=num;
            }


        }

        showMessageDialog(null,"The two biggest numbers are : " + biggestNum1 + " and " + biggestNum2);







    }
}

/*
Oppgave 5
Ref. forrige oppgave. Lag et program som finner de to største tallene av 10 heltall. En ekstra variabel må brukes.
 */
