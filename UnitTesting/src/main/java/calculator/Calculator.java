package calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int multiplication(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }

    public void doSomething(){
        throw new IllegalArgumentException();
    }

    public int subtraction(){
        return this.firstNumber - this.secondNumber;
    }
}
