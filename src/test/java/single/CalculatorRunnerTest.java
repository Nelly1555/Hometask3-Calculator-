package single;

import exceptions.OperationWasNotValidated;
import exceptions.StringWasNotValidated;
import model.Calculations;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * Набор тестов для проверки класса Calculations.
 */
public class CalculatorRunnerTest {

    /**
     * Создание нового объекта Calculations.
     */
    private Calculations calculations = new Calculations();

    /**
     * Позитивная проверка сложения двух целых чисел.
     */
    @Test
    public void testAddTwoIntegersPositive() {
        int num1 = calculations.putNumber("111");
        int num2 = calculations.putNumber("222");
        int expectedResult = 333;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    /**
     * Позитивная проверка сложения целого числа и нуля.
     */
    @Test
    public void testAddIntegerPlusZeroPositive() {
        int num1 = calculations.putNumber("100");
        int num2 = calculations.putNumber("0");
        int expectedResult = 100;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    /**
     * Позитивная проверка сложения нуля и целого числа.
     */
    @Test
    public void testAddZeroPlusIntegerPositive() {
        int num1 = calculations.putNumber("0");
        int num2 = calculations.putNumber("700");
        int expectedResult = 700;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    /**
     * Позитивная проверка сложения целого числа и отрицательного целого числа.
     */
    @Test
    public void testAddIntegerPlusNegativeIntegerPositive() {
        int num1 = calculations.putNumber("100");
        int num2 = calculations.putNumber("-50");
        int expectedResult = 50;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    /**
     * Позитивная проверка сложения отрицательного целого числа и целого числа.
     */
    @Test
    public void testAddNegativeIntegerPlusIntegerPositive() {
        int num1 = calculations.putNumber("-100");
        int num2 = calculations.putNumber("550");
        int expectedResult = 450;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    /**
     * Позитивная проверка сложения двух отрицательных целых чисел.
     */
    @Test
    public void testAddTwoNegativeIntegersPositive() {
        int num1 = calculations.putNumber("-555");
        int num2 = calculations.putNumber("-333");
        int expectedResult = -888;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    /**
     * Позитивная проверка вычитания двух целых чисел.
     */
    @Test
    public void testSubtractTwoIntegersPositive() {
        int num1 = calculations.putNumber("555");
        int num2 = calculations.putNumber("333");
        int expectedResult = 222;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    /**
     * Позитивная проверка вычитания отрицательного целого числа из целого числа.
     */
    @Test
    public void testSubtractIntegerAndNegativeIntegerPositive() {
        int num1 = calculations.putNumber("555");
        int num2 = calculations.putNumber("-333");
        int expectedResult = 888;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    /**
     * Позитивная проверка вычитания целого числа из отрицательного целого числа.
     */
    @Test
    public void testSubtractNegativeIntegerAndIntegerPositive() {
        int num1 = calculations.putNumber("-555");
        int num2 = calculations.putNumber("333");
        int expectedResult = -888;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    /**
     * Позитивная проверка вычитания отрицательных целых чисел.
     */
    @Test
    public void testSubtractNegativeIntegersPositive() {
        int num1 = calculations.putNumber("-555");
        int num2 = calculations.putNumber("-333");
        int expectedResult = -222;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    /**
     * Позитивная проверка вычитания нуля из целого числа.
     */
    @Test
    public void testSubtractIntegerAndZeroPositive() {
        int num1 = calculations.putNumber("777");
        int num2 = calculations.putNumber("0");
        int expectedResult = 777;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    /**
     * Позитивная проверка вычитания целого числа из нуля.
     */
    @Test
    public void testSubtractZeroAndIntegerPositive() {
        int num1 = calculations.putNumber("0");
        int num2 = calculations.putNumber("999");
        int expectedResult = -999;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    /**
     * Позитивная проверка умножения целых чисел.
     */
    @Test
    public void testMultiplyIntegersPositive() {
        int num1 = calculations.putNumber("50");
        int num2 = calculations.putNumber("300");
        int expectedResult = 15000;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    /**
     * Позитивная проверка умножения целого числа на отрицательное целого число.
     */
    @Test
    public void testMultiplyIntegerAndNegativeIntegerPositive() {
        int num1 = calculations.putNumber("50");
        int num2 = calculations.putNumber("-300");
        int expectedResult = -15000;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    /**
     * Позитивная проверка умножения отрицательного целого числа на целое число.
     */
    @Test
    public void testMultiplyNegativeIntegerAndIntegerPositive() {
        int num1 = calculations.putNumber("-900");
        int num2 = calculations.putNumber("3");
        int expectedResult = -2700;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    /**
     * Позитивная проверка умножения отрицательных чисел.
     */
    @Test
    public void testMultiplyNegativeIntegersPositive() {
        int num1 = calculations.putNumber("-900");
        int num2 = calculations.putNumber("-3");
        int expectedResult = 2700;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    /**
     * Позитивная проверка умножения целого числа на ноль.
     */
    @Test
    public void testMultiplyIntegerAndZeroPositive() {
        int num1 = calculations.putNumber("600");
        int num2 = calculations.putNumber("0");
        int expectedResult = 0;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    /**
     * Позитивная проверка умножения нуля на целое число.
     */
    @Test
    public void testMultiplyZeroAndIntegerPositive() {
        int num1 = calculations.putNumber("0");
        int num2 = calculations.putNumber("1800");
        int expectedResult = 0;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    /**
     * Позитивная проверка деления целых чисел.
     */
    @Test
    public void testDivideIntegersPositive() {
        int num1 = calculations.putNumber("180");
        int num2 = calculations.putNumber("9");
        int expectedResult = 20;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    /**
     * Позитивная проверка деления целого числа на отрицательное целое число.
     */
    @Test
    public void testDivideIntegerAndNegativeIntegerPositive() {
        int num1 = calculations.putNumber("180");
        int num2 = calculations.putNumber("-9");
        int expectedResult = -20;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    /**
     * Позитивная проверка деления отрицательного целого числа на целое число.
     */
    @Test
    public void testDivideNegativeIntegerAndIntegerPositive() {
        int num1 = calculations.putNumber("-180");
        int num2 = calculations.putNumber("9");
        int expectedResult = -20;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    /**
     * Позитивная проверка деления отрицательных чисел.
     */
    @Test
    public void testDivideNegativeIntegersPositive() {
        int num1 = calculations.putNumber("-180");
        int num2 = calculations.putNumber("-9");
        int expectedResult = 20;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    /**
     * Позитивная проверка деления нуля на целое число.
     */
    @Test
    public void testDivideZeroAndIntegerPositive() {
        int num1 = calculations.putNumber("0");
        int num2 = calculations.putNumber("900");
        int expectedResult = 0;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    /**
     * Негативная проверка деления на ноль с выводом исключения ArithmeticException.
     */
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideIntegerAndZeroNegative() {
        int num1 = calculations.putNumber("900");
        int num2 = calculations.putNumber("0");
        calculations.divide(num1, num2);
    }
}
