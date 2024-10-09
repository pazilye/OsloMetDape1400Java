package Arrays;

public class Oppgave5 {
    public static void main(String[] args) {

        int [] nums = {45,34, 5, 8, 10, 2, 13, 25};

        int biggestNum =nums[0];
        for (int i = 0; i <nums.length; i++) {
            if(nums[i]>biggestNum){
                biggestNum = nums[i];
            }
        }

        System.out.println("biggestNum = " + biggestNum);

        int smallestNum = nums[0];
        for (int i = 0; i <nums.length; i++) {
            if(nums[i]<smallestNum){
                smallestNum = nums[i];
            }
        }

        System.out.println("smallestNum = " + smallestNum);





    }
}

/*
Oppgave 5
Bruk arrayet i oppgave 4 og skriv kode for å finne det største og minste tallet i arrayet via en løkke. Tips: Sett største og minste tallet til første elementet i arrayet før løkken.
 */
