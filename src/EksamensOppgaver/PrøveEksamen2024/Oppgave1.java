package EksamensOppgaver.PrøveEksamen2024;

public class Oppgave1 {

    public static void investigateStringArray (String [] strings){

        //Strings containing "a"
            for (String each : strings) {
                if(each!= null && each.contains("a")){
                    System.out.println("strings containing 'a' : " + each );
                }
                }

            int countTotalOfChar=0;

        for (String each : strings) {
            if(each!=null){
                countTotalOfChar+=each.length();
            }


        }

        System.out.println("countTotalOfChar = " + countTotalOfChar);



        int countOfNull =0;

        for (String each : strings) {
            if(each==null){
                countOfNull++;
        }

        }

        System.out.println("countOfNull = " + countOfNull);




        }
    }


/*
The method public void investigateStringArray(String[] strings) shall:
• Print (System.out) all the strings in the array strings that contain the
letter ’a’.
• Print (System.out) how many chars the strings array contains.
• Print (System.out) how many null values the strings array contains.
Write the investigateStringArray method so that it works as described above. Hint: in the String class there is a contains method that can come in handy.
 */
