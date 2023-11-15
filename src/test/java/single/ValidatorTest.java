package single;

import exceptions.OperationWasNotValidated;
import exceptions.StringWasNotValidated;
import io.qameta.allure.*;
import model.Calculations;
import org.testng.annotations.Test;
import utils.Validator;
import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputOperationSign;
import static utils.Validator.validateInputString;

/**
 * Набор тестов для проверки класса Validator.
 */
@Owner("Нелли Миляева")
@Epic("Validator")
@Feature("Single tests")
public class ValidatorTest {

    /**
     * Создание нового объекта Validator.
     */
    private Validator validator = new Validator();

    /**
     * Создание нового объекта Calculations.
     */
    private Calculations calculations = new Calculations();


    @Test(description = "Позитивная проверка введения в консоль целого числа.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль целого числа.")
    @Description("Позитивный тест на введение в консоль целого числа.")
    public void testValidateInputIntegerPositive() {
        String number = "333";
        int actualResult = calculations.putNumber(validateInputString(number));
        int expectedResult = 333;
        assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Позитивная проверка введения в консоль отрицательного целого числа.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль отрицательного целого числа.")
    @Description("Позитивный тест на введение в консоль отрицательного целого числа.")
    public void testValidateInputNegativeIntegerPositive() {
        String number = "-555";
        int actualResult = calculations.putNumber(validateInputString(number));
        int expectedResult = -555;
        assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Позитивная проверка введения в консоль нуля.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль нуля.")
    @Description("Позитивный тест на введение в консоль нуля.")
    public void testValidateInputZeroPositive() {
        String number = "0";
        int actualResult = calculations.putNumber(validateInputString(number));
        int expectedResult = 0;
        assertEquals(actualResult, expectedResult);
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
    @Story("Проверка введения в консоль текста.")
    @Description("Негативный тест на введение в консоль текста с выводом исключения StringWasNotValidated.")
    public void testValidateInputWordNegative() {
        String number = "test";
        calculations.putNumber(validateInputString(number));
    }

    @Test(description = "Позитивная проверка введения в консоль знака операции \"плюс\".")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль знака операции \"плюс\".")
    @Description("Позитивный тест на введение в консоль знака операции \"плюс\".")
    public void testValidateInputPlusInOperationPositive() {
        String operation = "+";
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        int expectedResult = '+';
        assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Позитивная проверка введения в консоль знака операции \"минус\".")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль знака операции \"минус\".")
    @Description("Позитивный тест на введение в консоль знака операции \"минус\".")
    public void testValidateInputMinusInOperationPositive() {
        String operation = "-";
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        int expectedResult = '-';
        assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Позитивная проверка введения в консоль знака операции \"умножение\".")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль знака операции \"умножение\".")
    @Description("Позитивный тест на введение в консоль знака операции \"умножение\".")
    public void testValidateInputAsteriskInOperationPositive() {
        String operation = "*";
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        int expectedResult = '*';
        assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Позитивная проверка введения в консоль знака операции \"деление\".")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка введения в консоль знака операции \"деление\".")
    @Description("Позитивный тест на введение в консоль знака операции \"деление\".")
    public void testValidateInputDivisionSignInOperationPositive() {
        String operation = "/";
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        int expectedResult = '/';
        assertEquals(actualResult, expectedResult);
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
