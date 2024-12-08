package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdjektivList {

    public static ArrayList<String> readInAdjektivList(){
        File file = new File("src/TextInputOutput/adjektiv.txt");
        ArrayList<String> list = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while(input.hasNextLine()){
                String s = input.nextLine();
                list.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("darn, something went wrong with finding the file");
            e.printStackTrace();
        }

        return list;
    }
}

