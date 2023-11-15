package parameterized;

import exceptions.OperationWasNotValidated;
import exceptions.StringWasNotValidated;
import io.qameta.allure.*;
import model.Calculations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.Validator;

import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputOperationSign;
import static utils.Validator.validateInputString;

/**
 * Набор тестов с Data Provider для класса Validator.
 */
@Owner("Нелли Миляева")
@Epic("Validator")
@Feature("Parameterized tests")
public class ValidatorDataProvider {

    /**
     * Создание нового объекта Validator.
     */
    private Validator validator = new Validator();

    /**
     * Создание нового объекта Calculations.
     */
    private Calculations calculations = new Calculations();

    /**
     * Data Provider с тестовыми данными для позитивных тестов на ввод целых чисел в консоль.
     * @return - двумерный массив объектов (стандартный return для Data Provider).
     */
    @DataProvider
    public Object[][] getTestAndExpectedDataForNumber() {
        return new String[][] {
                {"333", Integer.toString(333)},
                {"-555", Integer.toString(-555)},
                {"0", Integer.toString(0)}
        };
    }

    /**
     * Data Provider с тестовыми данными для позитивных тестов на ввод знаков операции в консоль.
     * @return - двумерный массив объектов (стандартный return для Data Provider).
     */
    @DataProvider
    public Object[][] getTestAndExpectedDataForOperation() {
        return new String[][] {
                {"+", Character.toString('+')},
                {"-", Character.toString('-')},
                {"*", Character.toString('*')},
                {"/", Character.toString('/')},
        };
    }

    @Test(dataProvider = "getTestAndExpectedDataForNumber",
            description = "Позитивная проверка введения в консоль целого числа.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль целого числа.")
    @Description("Позитивный тест на введение в консоль целого числа.")
    public void testValidateInputIntegerPositive(String number, String expectedResult) {
        int actualResult = calculations.putNumber(validateInputString(number));
        assertEquals(actualResult, Integer. parseInt(expectedResult));
    }

    @Test(expectedExceptions = StringWasNotValidated.class,
            description = "Негативная проверка введения в консоль дробного числа с выводом исключения StringWasNotValidated.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль дробного числа.")
    @Description("Негативный тест на введение в консоль дробного числа с выводом исключения StringWasNotValidated.")
    public void testValidateInputDoubleNegative() {
        String number = "33.3";
        calculations.putNumber(validateInputString(number));
    }

    @Test(expectedExceptions = StringWasNotValidated.class,
            description = "Негативная проверка введения в консоль текста с выводом исключения StringWasNotValidated.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль текста вместо целого числа.")
    @Description("Негативный тест на введение в консоль текста вместо целого числа с выводом исключения StringWasNotValidated.")
    public void testValidateInputWordNegative() {
        String number = "test";
        calculations.putNumber(validateInputString(number));
    }

    @Test(dataProvider = "getTestAndExpectedDataForOperation",
            description = "Позитивная проверка введения в консоль знака операции.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль знака операции.")
    @Description("Позитивный тест на введение в консоль знака операции.")
    public void testValidateInputPlusInOperationPositive(String operation, String expectedResult) {
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        assertEquals(actualResult, expectedResult.charAt(0));
    }

    @Test(expectedExceptions = OperationWasNotValidated.class,
            description = "Негативная проверка введения в консоль буквы вместо знака операции с выводом исключения OperationWasNotValidated.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль буквы вместо знака операции.")
    @Description("Негативный тест на введение в консоль буквы вместо знака операции с выводом исключения OperationWasNotValidated.")
    public void testValidateInputLetterInOperationNegative() {
        String operation = "h";
        calculations.putNumber(validateInputOperationSign(operation));
    }
}
