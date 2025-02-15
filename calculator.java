import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите выражения: ");
        String numbers = scanner.nextLine().trim();

        String[] parts = numbers.split(" ");

        if(parts.length != 3) {
            throw new IllegalArgumentException("Ошибка, введенное выражение неверно");
        }

        try {
            int num1 = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int num2 = Integer.parseInt(parts[2]);

        if(num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new IllegalArgumentException("Введенные числа не между 1 и 10");
        }

        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2; 
                break;
            default:
                throw new IllegalArgumentException("Ошибка! Поддерживаются только операции: +, -, *, /.");
        }
        System.out.println("Результат: " + result);
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException("Ошибка! Ввод должен содержать только целые числа от 1 до 10.");
    }
        finally {
            scanner.close();
        }


    }
}