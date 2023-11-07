package utils;

import exceptions.OperationWasNotValidated;
import exceptions.StringWasNotValidated;

/**
 * Класс для проверки на валидацию.
 */
public class Validator {

    /**
     * Метод роверяет введённую строку на наличие в ней только целых чисел.
     * @param newNumber - проверяемая строка с числом.
     * @return - строка в случае успешной проверки, null - в случае, если проверка не прошла.
     */
    public static String validateInputString (String newNumber) throws StringWasNotValidated {

        if (newNumber.matches("-?\\d+")) {
            return newNumber;
        } else {
            throw new StringWasNotValidated("Error: Invalid number format - " + newNumber);
        }
    }

    /**
     * Метод роверяет введённую строку на наличие в ней только одного из следующих знаков: +, -, *, /.
     * @param newOperation - newOperation проверяеемая строка со знаком операции.
     * @return - строка в случае успешной проверки, null - в случае, если проверка не прошла.
     */
    public static String validateInputOperationSign (String newOperation) throws OperationWasNotValidated {

        if (newOperation.matches("[+\\-*/]")) {
            return newOperation;
        } else {
                throw new OperationWasNotValidated("Error: invalid operation sign - " + newOperation);
        }
    }
}
