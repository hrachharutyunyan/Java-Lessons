import java.util.Arrays;

/**
 * Дана последовательность ненулевых целых чисел, оканчивающаяся нулем.
 * Определить, сколько раз в этой последовательности меняется знак.
 * (Например,в последовательности 10, –4, 12, 56, –4 знак меняется 3 раза.)
 */
public class MathRandomTwo {

    public static void main(String[] args) {
        int[] array = {10, -4, 12, 56, -4};
        int count = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] / Math.abs(array[i]) != array[i + 1] / Math.abs(array[i + 1])) {
                count++;
            }
        }
        System.out.println("количество изменения знака: " + count);
    }
}
