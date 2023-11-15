package single;

import io.qameta.allure.*;
import model.Calculations;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Набор тестов для проверки класса Calculations.
 */
@Owner("Нелли Миляева")
@Epic("Calculator")
@Feature("Single tests")
public class CalculatorRunnerTest {

    /**
     * Создание нового объекта Calculations.
     */
    private Calculations calculations = new Calculations();

    @Test(description = "Позитивная проверка сложения двух целых чисел.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода сложения двух целых чисел.")
    @Description("Позитивный тест на проверку метода сложения двух целых чисел.")
    public void testAddTwoIntegersPositive() {
        int num1 = calculations.putNumber("111");
        int num2 = calculations.putNumber("222");
        int expectedResult = 333;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    @Test(description = "Позитивная проверка сложения целого числа и нуля.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода сложения целого числа и нуля.")
    @Description("Позитивный тест на проверку метода сложения целого числа и нуля.")
    public void testAddIntegerPlusZeroPositive() {
        int num1 = calculations.putNumber("100");
        int num2 = calculations.putNumber("0");
        int expectedResult = 100;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    @Test(description = "Позитивная проверка сложения нуля и целого числа.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода сложения нуля и целого числа.")
    @Description("Позитивный тест на проверку метода сложения нуля и целого числа.")
    public void testAddZeroPlusIntegerPositive() {
        int num1 = calculations.putNumber("0");
        int num2 = calculations.putNumber("700");
        int expectedResult = 700;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    @Test(description = "Позитивная проверка сложения целого числа и отрицательного целого числа.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода сложения целого числа и отрицательного целого числа.")
    @Description("Позитивный тест на проверку метода сложения целого числа и отрицательного целого числа.")
    public void testAddIntegerPlusNegativeIntegerPositive() {
        int num1 = calculations.putNumber("100");
        int num2 = calculations.putNumber("-50");
        int expectedResult = 50;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    @Test(description = "Позитивная проверка сложения отрицательного целого числа и целого числа.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода сложения отрицательного целого числа и целого числа.")
    @Description("Позитивный тест на проверку метода сложения отрицательного целого числа и целого числа.")
    public void testAddNegativeIntegerPlusIntegerPositive() {
        int num1 = calculations.putNumber("-100");
        int num2 = calculations.putNumber("550");
        int expectedResult = 450;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    @Test(description = "Позитивная проверка сложения двух отрицательных целых чисел.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода сложения двух отрицательных целых чисел.")
    @Description("Позитивный тест на проверку метода сложения двух отрицательных целых чисел.")
    public void testAddTwoNegativeIntegersPositive() {
        int num1 = calculations.putNumber("-555");
        int num2 = calculations.putNumber("-333");
        int expectedResult = -888;
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect addition result.");
    }

    @Test(description = "Позитивная проверка вычитания двух целых чисел.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода вычитания двух целых чисел.")
    @Description("Позитивный тест на проверку метода вычитания двух целых чисел.")
    public void testSubtractTwoIntegersPositive() {
        int num1 = calculations.putNumber("555");
        int num2 = calculations.putNumber("333");
        int expectedResult = 222;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    @Test(description = "Позитивная проверка вычитания отрицательного целого числа из целого числа.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода вычитания отрицательного целого числа из целого числа.")
    @Description("Позитивный тест на проверку метода вычитания отрицательного целого числа из целого числа.")
    public void testSubtractIntegerAndNegativeIntegerPositive() {
        int num1 = calculations.putNumber("555");
        int num2 = calculations.putNumber("-333");
        int expectedResult = 888;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    @Test(description = "Позитивная проверка вычитания целого числа из отрицательного целого числа.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода вычитания целого числа из отрицательного целого числа.")
    @Description("Позитивный тест на проверку метода вычитания целого числа из отрицательного целого числа.")
    public void testSubtractNegativeIntegerAndIntegerPositive() {
        int num1 = calculations.putNumber("-555");
        int num2 = calculations.putNumber("333");
        int expectedResult = -888;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    @Test(description = "Позитивная проверка вычитания отрицательных целых чисел.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода вычитания отрицательных целых чисел.")
    @Description("Позитивный тест на проверку метода вычитания отрицательных целых чисел.")
    public void testSubtractNegativeIntegersPositive() {
        int num1 = calculations.putNumber("-555");
        int num2 = calculations.putNumber("-333");
        int expectedResult = -222;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    @Test(description = "Позитивная проверка вычитания нуля из целого числа.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода вычитания нуля из целого числа.")
    @Description("Позитивный тест на проверку метода вычитания нуля из целого числа.")
    public void testSubtractIntegerAndZeroPositive() {
        int num1 = calculations.putNumber("777");
        int num2 = calculations.putNumber("0");
        int expectedResult = 777;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    @Test(description = "Позитивная проверка вычитания целого числа из нуля.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода вычитания целого числа из нуля.")
    @Description("Позитивный тест на проверку метода вычитания целого числа из нуля.")
    public void testSubtractZeroAndIntegerPositive() {
        int num1 = calculations.putNumber("0");
        int num2 = calculations.putNumber("999");
        int expectedResult = -999;
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect subtract result.");
    }

    @Test(description = "Позитивная проверка умножения целых чисел.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода умножения целых чисел.")
    @Description("Позитивный тест на проверку метода умножения целых чисел.")
    public void testMultiplyIntegersPositive() {
        int num1 = calculations.putNumber("50");
        int num2 = calculations.putNumber("300");
        int expectedResult = 15000;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    @Test(description = "Позитивная проверка умножения целого числа на отрицательное целого число.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода умножения целого числа на отрицательное целого число.")
    @Description("Позитивный тест на проверку метода умножения целого числа на отрицательное целого число.")
    public void testMultiplyIntegerAndNegativeIntegerPositive() {
        int num1 = calculations.putNumber("50");
        int num2 = calculations.putNumber("-300");
        int expectedResult = -15000;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    @Test(description = "Позитивная проверка умножения отрицательного целого числа на целое число.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода умножения отрицательного целого числа на целое число.")
    @Description("Позитивный тест на проверку метода умножения отрицательного целого числа на целое число.")
    public void testMultiplyNegativeIntegerAndIntegerPositive() {
        int num1 = calculations.putNumber("-900");
        int num2 = calculations.putNumber("3");
        int expectedResult = -2700;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    @Test(description = "Позитивная проверка умножения отрицательных чисел.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода умножения отрицательных чисел.")
    @Description("Позитивный тест на проверку метода умножения отрицательных чисел.")
    public void testMultiplyNegativeIntegersPositive() {
        int num1 = calculations.putNumber("-900");
        int num2 = calculations.putNumber("-3");
        int expectedResult = 2700;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    @Test(description = "Позитивная проверка умножения целого числа на ноль.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода умножения целого числа на ноль.")
    @Description("Позитивный тест на проверку метода умножения целого числа на ноль.")
    public void testMultiplyIntegerAndZeroPositive() {
        int num1 = calculations.putNumber("600");
        int num2 = calculations.putNumber("0");
        int expectedResult = 0;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    @Test(description = "Позитивная проверка умножения нуля на целое число.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода умножения нуля на целое число.")
    @Description("Позитивный тест на проверку метода умножения нуля на целое число.")
    public void testMultiplyZeroAndIntegerPositive() {
        int num1 = calculations.putNumber("0");
        int num2 = calculations.putNumber("1800");
        int expectedResult = 0;
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect multiply result.");
    }

    @Test(description = "Позитивная проверка деления целых чисел.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода деления целых чисел.")
    @Description("Позитивный тест на проверку метода деления целых чисел.")
    public void testDivideIntegersPositive() {
        int num1 = calculations.putNumber("180");
        int num2 = calculations.putNumber("9");
        int expectedResult = 20;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    @Test(description = "Позитивная проверка деления целого числа на отрицательное целое число.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода деления целого числа на отрицательное целое число.")
    @Description("Позитивный тест на проверку метода деления целого числа на отрицательное целое число.")
    public void testDivideIntegerAndNegativeIntegerPositive() {
        int num1 = calculations.putNumber("180");
        int num2 = calculations.putNumber("-9");
        int expectedResult = -20;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    @Test(description = "Позитивная проверка деления отрицательного целого числа на целое число.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода деления отрицательного целого числа на целое число.")
    @Description("Позитивный тест на проверку метода деления отрицательного целого числа на целое число.")
    public void testDivideNegativeIntegerAndIntegerPositive() {
        int num1 = calculations.putNumber("-180");
        int num2 = calculations.putNumber("9");
        int expectedResult = -20;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    @Test(description = "Позитивная проверка деления отрицательных чисел.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода деления отрицательных чисел.")
    @Description("Позитивный тест на проверку метода деления отрицательных чисел.")
    public void testDivideNegativeIntegersPositive() {
        int num1 = calculations.putNumber("-180");
        int num2 = calculations.putNumber("-9");
        int expectedResult = 20;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    @Test(description = "Позитивная проверка деления нуля на целое число.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода деления нуля на целое число.")
    @Description("Позитивный тест на проверку метода деления нуля на целое число.")
    public void testDivideZeroAndIntegerPositive() {
        int num1 = calculations.putNumber("0");
        int num2 = calculations.putNumber("900");
        int expectedResult = 0;
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, expectedResult, "Incorrect divide result.");
    }

    @Test(expectedExceptions = ArithmeticException.class,
            description = "Негативная проверка деления на ноль с выводом исключения ArithmeticException.")
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка метода деления на ноль.")
    @Description("Негативный тест на проверку метода деления на ноль с выводом исключения ArithmeticException.")
    public void testDivideIntegerAndZeroNegative() {
        int num1 = calculations.putNumber("900");
        int num2 = calculations.putNumber("0");
        calculations.divide(num1, num2);
    }
}
