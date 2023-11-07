package model;

/**
 * Класс Калькулятор:
 * 1. Преобразует числа, введённые в строковом формате в целочисленный формат;
 * 2. Преобразует знаки опреаций, введённые в строковом формате в формат символов;
 * 3. Содержит в себе методы сложения, вычитания, умножения и деления целых чисел.
 */
public class Calculations {

    /**
     * Переменная для хранения числа.
     */
    private int num = 0;

    /**
     * Переменная для хранения знака операции.
     */
    private char operation;


    /**
     * Метод для перевода строки в целое число.
     * @param newString - новая строка.
     * @return - возвращает целое число.
     */
     public int putNumber(String newString) {
        if (newString != null) {
            num = Integer.parseInt(newString);
        }
         return num;
     }

    /**
     * Метод для перевода строки в символ (знак операции).
     * @param newString - новая строка.
     * @return - возвращает символ (знак операции).
     */
    public int putOperation(String newString) {
        if (newString != null) {
            operation = newString.charAt(0);
        }
        return operation;
    }

    /**
     * Метод для выполнения сложения двух чисел.
     * @param num1 - первое число.
     * @param num2 - второе число.
     * @return - результат сложения.
     */
    public static int add (int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Метод для выполнения вычитания двух чисел.
     * @param num1 - первое число.
     * @param num2 - второе число.
     * @return - результат вычитания.
     */
    public static int subtract (int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Метод для выполнения умножения двух чисел.
     * @param num1 - первое число.
     * @param num2 - второе число.
     * @return - результат умножения.
     */
    public static int multiply (int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Метод для выполнения деления двух чисел.
     * @param num1 - первое число.
     * @param num2 - второе число.
     * @return - результат деления.
     */
    public static int divide (int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is impossible!");
        }
        return num1 / num2;
    }
}

