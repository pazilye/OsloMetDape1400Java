package Arrays;

public class Oppgave7 {
    public static void main(String[] args) {

        int [] nums1 = {45,34, 5, 8, 10, 2, 13, 25};

        int parTall = 0;
        int oddeTall =0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] %2 ==0){
                parTall++;
            }else {
                oddeTall++;
            }

        }

        System.out.println("parTall = " + parTall);
        System.out.println("oddeTall = " + oddeTall);




    }
}

/*
Oppgave 6
Oppgave 7
Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.
 */
