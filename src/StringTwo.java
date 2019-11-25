import java.util.Scanner;

/**
 * Дан текст, в котором имеются цифры.
 * а) Найти их сумму.
 * б) Найти максимальную цифру.
 */
public class StringTwo {

    public static void main(String[] args) {
        System.out.println("введите текст:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("сумма цифр: " + findSumOfText(text));
        System.out.println("максимальная цифра: " + findMaxNumberOfText(text));
    }
    /**
     *
     * @param text
     * @return Sum of text elements
     */
     private static int findSumOfText(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char textElement = text.charAt(i);
            if (Character.isDigit(textElement) && (textElement > 47 && textElement < 58)) {
                sum += Character.getNumericValue(textElement);
            }
        }
        return sum;
    }
    /**
     *
     * @param text
     * @return Max of text elements
     */
     private static int findMaxNumberOfText(String text) {
        int max = 0;
        int tempNum;
        for (int i = 0; i < text.length(); i++) {
            char textElement = text.charAt(i);
            if (Character.isDigit(textElement) && (textElement > 47 && textElement < 58)) {
                tempNum = Character.getNumericValue(textElement);
                if (tempNum > max) max = tempNum;
            }
        }
        return max;
    }
}
