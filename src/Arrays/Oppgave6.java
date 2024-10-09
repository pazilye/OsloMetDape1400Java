package Arrays;

public class Oppgave6 {
    public static void main(String[] args) {

        int [] nums1 = {45,34, 5, 8, 10, 2, 13, 25};
        int [] nums2 = {1,2,3,4,5,6,7,8,9};

       if(nums1.length  != nums2.length){
           System.out.println("Arrays dont have the equal length");
       }else {
           boolean like = true;
           for (int i = 0; i < nums1.length; i++) {
               if(nums1[i] == nums2[i]){
                   like = false;
               }

           }
           if(like){
               System.out.println("Arrays are equal ");
           }else {
               System.out.println("Arrays are not equal ");
           }

       }





        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    System.out.println(nums1[i]+" "+nums2[j]);
                }

            }

        }

    }


}

/*
Oppgave 6
Lag et program som sjekker om to heltalls-arrays er like. Bruk løkker, ikke innebygd java klasse/metode.
 */
