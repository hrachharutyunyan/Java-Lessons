import java.util.ArrayList;
import java.util.List;

/**
 * Определить сумму квадратов всех элементов коллекции.
 */
public class CollectionsOne {

    public static void main(String[] args) {
        CollectionsOne collectionsOne = new CollectionsOne();
        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(collectionsOne.getSum(list));
    }

    /**
     * @param list
     * @return Sum of number's square
     */
    private int getSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
