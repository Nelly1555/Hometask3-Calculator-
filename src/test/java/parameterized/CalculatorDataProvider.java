package parameterized;

import model.Calculations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Набор тестов с Data Provider для класса Calculations.
 */
public class CalculatorDataProvider {

    /**
     * Создание нового объекта Calculations.
     */
    private Calculations calculations = new Calculations();

    /**
     * Data Provider с тестовыми данными для позитивных тестов на сложение.
     * @return - двумерный массив объектов (стандартный return для Data Provider).
     */
    @DataProvider
    public Object[][] getTestAndExpectedDataForAdd() {
        return new String[][] {
                {"111", "222", Integer.toString(333)},
                {"100", "0", Integer.toString(100)},
                {"0", "700", Integer.toString(700)},
                {"100", "-50", Integer.toString(50)},
                {"-555", "-333", Integer.toString(-888)},
                {"-50", "100", Integer.toString(50)},
        };
    }

    /**
     * Data Provider с тестовыми данными для позитивных тестов на вычитание.
     * @return - двумерный массив объектов (стандартный return для Data Provider).
     */
    @DataProvider
    public Object[][] getTestAndExpectedDataForSubtract() {
        return new String[][] {
                {"555", "333", Integer.toString(222)},
                {"555", "-333", Integer.toString(888)},
                {"-555", "333", Integer.toString(-888)},
                {"-555", "-333", Integer.toString(-222)},
                {"777", "0", Integer.toString(777)},
                {"0", "999", Integer.toString(-999)},
        };
    }

    /**
     * Data Provider с тестовыми данными для позитивных тестов на умножение.
     * @return - двумерный массив объектов (стандартный return для Data Provider).
     */
    @DataProvider
    public Object[][] getTestAndExpectedDataForMultiply() {
        return new String[][] {
                {"50", "300", Integer.toString(15000)},
                {"50", "-300", Integer.toString(-15000)},
                {"-900", "3", Integer.toString(-2700)},
                {"-900", "-3", Integer.toString(2700)},
                {"600", "0", Integer.toString(0)},
                {"0", "1800", Integer.toString(0)},
        };
    }

    /**
     * Data Provider с тестовыми данными для позитивных тестов на деление.
     * @return - двумерный массив объектов (стандартный return для Data Provider).
     */
    @DataProvider
    public Object[][] getTestAndExpectedDataForDivide() {
        return new String[][] {
                {"180", "9", Integer.toString(20)},
                {"180", "-9", Integer.toString(-20)},
                {"-180", "9", Integer.toString(-20)},
                {"-180", "-9", Integer.toString(20)},
                {"0", "900", Integer.toString(0)},
        };
    }

    /**
     * Позитивная проверка метода сложения.
     */
    @Test(dataProvider = "getTestAndExpectedDataForAdd")
    public void testAddTwoIntegersPositive(String firstString, String secondString, String expectedResult) {
        int num1 = calculations.putNumber (firstString);
        int num2 = calculations.putNumber (secondString);
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, Integer. parseInt(expectedResult), "Incorrect addition result.");
    }

    /**
     * Позитивная проверка метода вычитания.
     */
    @Test(dataProvider = "getTestAndExpectedDataForSubtract")
    public void testSubtractTwoIntegersPositive(String firstString, String secondString, String expectedResult) {
        int num1 = calculations.putNumber(firstString);
        int num2 = calculations.putNumber(secondString);
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, Integer. parseInt(expectedResult), "Incorrect subtract result.");
    }

    /**
     * Позитивная проверка метода умножения.
     */
    @Test(dataProvider = "getTestAndExpectedDataForMultiply")
    public void testMultiplyTwoIntegersPositive(String firstString, String secondString, String expectedResult) {
        int num1 = calculations.putNumber(firstString);
        int num2 = calculations.putNumber(secondString);
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, Integer. parseInt(expectedResult), "Incorrect multiply result.");
    }

    /**
     * Позитивная проверка метода деления.
     */
    @Test(dataProvider = "getTestAndExpectedDataForDivide")
    public void testDivideIntegersPositive(String firstString, String secondString, String expectedResult) {
        int num1 = calculations.putNumber(firstString);
        int num2 = calculations.putNumber(secondString);
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, Integer. parseInt(expectedResult), "Incorrect divide result.");
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

