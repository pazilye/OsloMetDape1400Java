package ArithmaticAndLogicalOperations;
import static javax.swing.JOptionPane.*;

public class Oppgave7 {
    public static void main(String[] args) {

        String numberOfPizza, numberOfPeople, numberOfSlicesPerPizza;

        numberOfPizza = showInputDialog("Enter number of pizzas: ");
        numberOfPeople = showInputDialog("Enter number of people: ");
        numberOfSlicesPerPizza = showInputDialog("Enter number of slices: ");

        int numberOfPizzas = Integer.parseInt(numberOfPizza);
        int numberOfSlices = Integer.parseInt(numberOfSlicesPerPizza);
        int numOfPeople = Integer.parseInt(numberOfPeople);

        int numberOfSlicesPerPerson = (numberOfPizzas * numberOfSlices) / numOfPeople; // we are finding out how many slices of pizza per person get by multiplying number of pizzas to number of slices and dividing it by the number of people

        int restOfSlices = (numberOfPizzas * numberOfSlices) % numOfPeople;





        showMessageDialog(null,"If there are people  " + numOfPeople + " and there are " + numberOfPizzas + " pizzas, then every person will get " + numberOfSlicesPerPerson+ " slices, and " +restOfSlices + " slices will be left off. " );


    }
}

/*
Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza. Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver. Hvor mange slices er det til overs dersom man deler likt? Bruk modulus operatoren. Skriv ut resultatet på følgende form: ”Dersom man er 4 personer og har 3 pizzaer får hver person 4 slices og 2 blir til overs”.
 */