package Arrays;

public class Oppgave3 {
    public static void main(String[] args) {

        String [] arrayOfNames  = {"Per","Hansen","Line","Olsen","Ola","Pedersen","Kari","Finnsen"};

        for (int i = 0; i <arrayOfNames.length ; i+=2) {
            System.out.println(arrayOfNames[i] + " " + arrayOfNames[i+1]);



        }







    }

}

/*
Oppgave 3
Gitt følgende string-array : Per, Hansen, Line, Olsen, Ola, Pedersen, Kari, Finnsen. Skriv så ut for og etternavn på flere linjer med en løkke som vist under:

Per Hansen
Line Olsen
....
 */
