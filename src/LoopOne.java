import java.util.Scanner;

/**
 * Дано вещественное число — цена 1 кг конфет.
 * Вывести стоимость 2,4, …, 10 кг конфет.
 */
public class LoopOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float price = scanner.nextFloat();

        for (float kg = 2; kg <= 10; kg += 2) {
            System.out.println(kg + " kg = " + price * kg + " Dram");
        }
    }
}

