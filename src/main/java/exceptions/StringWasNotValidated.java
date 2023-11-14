package exceptions;

/**
 * Исключение для выведения ошибки, в случае введения любого символа, кроме челого числа.
 */
public class StringWasNotValidated extends RuntimeException {

    /**
     * Метод для выведения исключения.
     * @param message - сообщение об ошибке (Error: Invalid number format).
     */
    public StringWasNotValidated(String message) {
        super(message);
    }

}
