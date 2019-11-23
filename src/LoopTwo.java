import java.util.Scanner;

/**
 * Дано вещественное число A и целое число N (> 0). Используя один цикл,
 * найти значение выражения 1 – A + A 2 – A 3 + … + (–1) N· AN.
 * Условный   оператор не использовать.
 */
public class LoopTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A:");
        double a = scanner.nextDouble();
        System.out.print("N:");
        int n = scanner.nextInt();
        double a2 = 1;
        double result = 1;
        for (int i = 2; i <= n; ++i) {
            a2 *= -a;
            result += a2;
        }
        System.out.println(result);
    }
}
