package ArithmaticAndLogicalOperations;
import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args) {

        String name, age, birthYear,ageIn30Years;


        name = showInputDialog("Please write your name");
        age = showInputDialog("Please write your age");

        birthYear = showInputDialog("Please write your birth year");



        int ageInt = Integer.parseInt(age);
        int birthYearInt = Integer.parseInt(birthYear);

        ageIn30Years = String.valueOf(ageInt +30);

        showMessageDialog(null,name +" per this year is " + ageInt + " year old. She was born in " +birthYearInt+"." + " In 2053 she will be " + ageIn30Years + " years old." );






    }
}

/*
Les inn to variabler; navn, alder. Skriv så følgende historie (et eksempel): Per Olsen er i dag 32 år. Han er født i 1986. I 2053 er han 67 år og da vil han være pensjonist.

(Tallene er utifra året 2018).
 */