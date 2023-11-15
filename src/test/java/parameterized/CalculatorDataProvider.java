package parameterized;

import io.qameta.allure.*;
import model.Calculations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Набор тестов с Data Provider для класса Calculations.
 */
@Owner("Нелли Миляева")
@Epic("Calculator")
@Feature("Parameterized tests")
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

    @Test(dataProvider = "getTestAndExpectedDataForAdd",
            description = "Позитивная проверка метода сложения.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода сложения с Data Provider.")
    @Description("Позитивный тест на проверку метода сложения с Data Provider.")
    public void testAddTwoIntegersPositive(String firstString, String secondString, String expectedResult) {
        int num1 = calculations.putNumber (firstString);
        int num2 = calculations.putNumber (secondString);
        int actualResult = calculations.add(num1, num2);
        assertEquals(actualResult, Integer. parseInt(expectedResult), "Incorrect addition result.");
    }

    @Test(dataProvider = "getTestAndExpectedDataForSubtract",
            description = "Позитивная проверка метода вычитания.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода вычитания с Data Provider.")
    @Description("Позитивный тест на проверку метода вычитания с Data Provider.")
    public void testSubtractTwoIntegersPositive(String firstString, String secondString, String expectedResult) {
        int num1 = calculations.putNumber(firstString);
        int num2 = calculations.putNumber(secondString);
        int actualResult = calculations.subtract(num1, num2);
        assertEquals(actualResult, Integer. parseInt(expectedResult), "Incorrect subtract result.");
    }

    @Test(dataProvider = "getTestAndExpectedDataForMultiply",
            description = "Позитивная проверка метода умножения.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода умножения с Data Provider.")
    @Description("Позитивный тест на проверку метода умножения с Data Provider.")
    public void testMultiplyTwoIntegersPositive(String firstString, String secondString, String expectedResult) {
        int num1 = calculations.putNumber(firstString);
        int num2 = calculations.putNumber(secondString);
        int actualResult = calculations.multiply(num1, num2);
        assertEquals(actualResult, Integer. parseInt(expectedResult), "Incorrect multiply result.");
    }

    @Test(dataProvider = "getTestAndExpectedDataForDivide",
            description = "Позитивная проверка метода деления.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка метода деления с Data Provider.")
    @Description("Позитивный тест на проверку метода деления с Data Provider.")
    public void testDivideIntegersPositive(String firstString, String secondString, String expectedResult) {
        int num1 = calculations.putNumber(firstString);
        int num2 = calculations.putNumber(secondString);
        int actualResult = calculations.divide(num1, num2);
        assertEquals(actualResult, Integer. parseInt(expectedResult), "Incorrect divide result.");
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

