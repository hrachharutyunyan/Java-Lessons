import java.util.Scanner;

/**
 * Вычислить значение функции y = f(x). Дана следующая функция y = f(x):
 * Пользователь вводит с клавиатуры значение переменной а программа должна
 * вывести  ответ  на консоль.
 *     y = 3x - 5, если x > 0
 *     y = 0 , если x = 0
 *     y =  |x| - 1, если x < 0
 * Требуется найти значение функции по переданному.
 */
public class IfElseTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x > 0) {
            y = (3 * x) - 5;
            System.out.println(y);
        } else if (x == 0) {
            y = 0;
            System.out.println(y);
        } else {  // x < 0
            y = Math.abs(x) - 1;
            System.out.println(y);
        }
    }
}
