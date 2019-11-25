import java.util.Scanner;

/**
 * Дано слово. Получить и вывести на экран буквосочетание, состоящее из его
 * третьего и последнего символа.
 */
public class StringOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово :");
        String str = scanner.nextLine();
        System.out.println(str.substring(2, 3) + str.substring(str.length() - 1));
    }
}
