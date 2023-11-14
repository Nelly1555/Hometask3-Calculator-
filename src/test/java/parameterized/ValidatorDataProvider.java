package parameterized;

import exceptions.OperationWasNotValidated;
import exceptions.StringWasNotValidated;
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

    /**
     * Позитивная проверка введения в консоль целого числа.
     */
    @Test(dataProvider = "getTestAndExpectedDataForNumber")
    public void testValidateInputIntegerPositive(String number, String expectedResult) {
        int actualResult = calculations.putNumber(validateInputString(number));
        assertEquals(actualResult, Integer. parseInt(expectedResult));
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
     * Позитивная проверка введения в консоль знака операции.
     */
    @Test(dataProvider = "getTestAndExpectedDataForOperation")
    public void testValidateInputPlusInOperationPositive(String operation, String expectedResult) {
        int actualResult = calculations.putOperation(validateInputOperationSign(operation));
        assertEquals(actualResult, expectedResult.charAt(0));
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
