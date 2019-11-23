import java.util.Scanner;

/**
 * Пользователю необходимо ввести число с клавиатуры.
 * Если оно является положительным, то прибавить к нему 2;
 * в противном случае умножить на 2.
 * Вывести полученное число.
 */

public class IfElseOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            number += 2;
        } else {
            number *= 2;
        }
        System.out.println(number);
    }
}
