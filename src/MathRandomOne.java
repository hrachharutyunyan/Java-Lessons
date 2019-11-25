import java.util.Arrays;

/**
 * Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random(),
 * который возвращает значение в промежутке [3, 15].
 */
public class MathRandomOne {

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 3 + (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int avg = 0;

        for (int value : array) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
            avg += value;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg / array.length);
    }
}
