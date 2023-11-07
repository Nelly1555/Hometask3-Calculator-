import model.Calculations;
import java.util.Scanner;

import static utils.Validator.validateInputOperationSign;
import static utils.Validator.validateInputString;

/**
 * Консольный калькулятор для выполнения арифметических операций с целыми числами.
 */
public class CalculatorRunner {

    /**
     * Главный метод, который запускает калькулятор и обрабатывает пользовательский ввод.
     */
    public static void main(String[] args) {

        // Создание объекта Calculations.
        Calculations calculations = new Calculations();

        // Создание переменной для хранения значения результата.
        int result;

        // Бесконечный цикл, чтобы выполнение программы не прерывалось.
        while (true) {

            // Создание объекта Сканнер.
            Scanner scanner = new Scanner(System.in);


            // Запрос первого числа для введения в консоль.
            System.out.println("Enter first number: ");

            // Проверка первого числа с помощью регулярного выражения.
            String number1 = validateInputString(scanner.next());

            // Добавление чисел в калькулятор.
            int num1 = calculations.putNumber(number1);


            // Запрос знака операции для введения в консоль.
            System.out.println("Enter the operation sign (+, -, *, /): ");

            // Проверка знака операции с помощью регулярного выражения
            String operator = validateInputOperationSign(scanner.next());


            // Запрос второго числа для введения в консоль.
            System.out.println("Enter second number: ");

            // Проверка второго числа с помощью регулярного выражения
            String number2 = validateInputString(scanner.next());

            // Добавление чисел в калькулятор
            int num2 = calculations.putNumber(number2);


            // Вычисление результата в зависимости от выбранной операции.
            switch (operator) {
                case "+" -> {
                    result = Calculations.add(num1, num2);
                    System.out.println("The result is: " + result + "\n");
                }
                case "-" -> {
                    result = Calculations.subtract(num1, num2);
                    System.out.println("The result is: " + result + "\n");
                }
                case "*" -> {
                    result = Calculations.multiply(num1, num2);
                    System.out.println("The result is: " + result + "\n");
                }
                case "/" -> {
                    result = Calculations.divide(num1, num2);
                    System.out.println("The result is: " + result + "\n");
                }
            }
        }
    }
}


