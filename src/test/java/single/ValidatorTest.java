package single;

import exceptions.OperationWasNotValidated;
import exceptions.StringWasNotValidated;
import model.Calculations;
import org.testng.annotations.Test;
import utils.Validator;
import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputOperationSign;
import static utils.Validator.validateInputString;

/**
 * Набор тестов для проверки класса Validator.
 */
public class ValidatorTest {

    /**
     * Создание нового объекта Validator.
     */
    private Validator validator = new Validator();

    /**
     * Создание нового объекта Calculations.
     */
    private Calculations calculations = new Calculations();

    /**
     * Позитивная проверка введения в консоль целого числа.
     */
    @Test
    public void testValidateInputIntegerPositive() {
        String number = "333";
        int actualResult = calculations.putNumber(validateInputString(number));
        int expectedResult = 333;
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Позитивная проверка введения в консоль отрицательного целого числа.
     */
    @Test
    public void testValidateInputNegativeIntegerPositive() {
        String number = "-555";
        int actualResult = calculations.putNumber(validateInputString(number));
        int expectedResult = -555;
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Позитивная проверка введения в консоль нуля.
     */
    @Test
    public void testValidateInputZeroPositive() {
        String number = "0";
        int actualResult = calculations.putNumber(validateInputString(number));
        int expectedResult = 0;
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Негативная проверка введения в консоль дробного числа
     * с выводом исключения StringWasNotValidated.
     */
    @Test(expectedExceptions = StringWasNotValidated.class)
    public void testValidateInputDoubleNegative() {
        String number = "33.3";
        calculations.putNumber(validateInputString(number));
    }

    /**
     * Негативная проверка введения в консоль текста
     * с выводом исключения StringWasNotValidated.
     */
    @Test(expectedExceptions = StringWasNotValidated.class)
    public void testValidateInputWordNegative() {
        String number = "test";
        calculations.putNumber(validateInputString(number));
    }

    /**
     * Позитивная проверка введения в консоль знака операции "плюс".
     */
    @Test
    public void testValidateInputPlusInOperationPositive() {
        String operation = "+";
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        int expectedResult = '+';
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Позитивная проверка введения в консоль знака операции "минус".
     */
    @Test
    public void testValidateInputMinusInOperationPositive() {
        String operation = "-";
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        int expectedResult = '-';
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Позитивная проверка введения в консоль знака операции "умножение".
     */
    @Test
    public void testValidateInputAsteriskInOperationPositive() {
        String operation = "*";
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        int expectedResult = '*';
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Позитивная проверка введения в консоль знака операции "деление".
     */
    @Test
    public void testValidateInputDivisionSignInOperationPositive() {
        String operation = "/";
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        int expectedResult = '/';
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Негативная проверка введения в консоль буквы вместо знака операции
     * с выводом исключения OperationWasNotValidated.
     */
    @Test(expectedExceptions = OperationWasNotValidated.class)
    public void testValidateInputLetterInOperationNegative() {
        String operation = "h";
        calculations.putNumber(validateInputOperationSign(operation));
    }
}
