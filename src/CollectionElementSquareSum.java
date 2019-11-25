import java.util.ArrayList;
import java.util.List;

/**
 * Sum of collection's elements square.
 */
public class CollectionElementSquareSum {

    public static void main(String[] args) {
        CollectionElementSquareSum squareSum = new CollectionElementSquareSum();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(squareSum.getSum(list));
    }

    /**
     * Calculating sum of collection elements' square.
     *
     * @param list list of numbers.
     * @return sum of number's square.
     */
    private int getSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
