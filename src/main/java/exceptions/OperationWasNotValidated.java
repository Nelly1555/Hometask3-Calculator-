package exceptions;

/**
 * Исключение для выведения ошибки в случае введения любого символа, кроме знаков операций: +, -, *, /.
 */
public class OperationWasNotValidated extends RuntimeException {

    /**
     * Метод для выведения исключения.
     * @param message - сообщение об ошибке (Error: invalid operation sign).
     */
    public OperationWasNotValidated(String message) {
        super(message);
    }

}
