package calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSumWithPositiveNumbers() {
        //Arrange
        Calculator calculator = new Calculator(5, 6);
        //Act
        int sum = calculator.sum(5, 6);
        //Assert
        Assert.assertEquals(11, sum);
    }

    @Test
    public void testMultiplicationWithNegativeNumbers() {
        //Act
        int result = Calculator.multiplication(-5, -3);
        //Assert
        Assert.assertEquals(15, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoSomethingMethodThrowsException() {
        Calculator calculator = new Calculator(2, 3);
        calculator.doSomething();
    }

}