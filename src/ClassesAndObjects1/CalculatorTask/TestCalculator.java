package ClassesAndObjects1.CalculatorTask;

public class TestCalculator {
    public static void main(String[] args) {

        // sum of two numbers test method

        double sumResult = Calculator.addition(4,5);
        double subtractResult = Calculator.subtraction(10,5);
        double multipResult = Calculator.multiplication(4,5);
        double divideResult = Calculator.division(20,5);

        System.out.println("sumResult = " + sumResult);
        System.out.println("subtract = " + subtractResult);
        System.out.println("multiply = " + multipResult);
        System.out.println("divide = " + divideResult);




    }
}
