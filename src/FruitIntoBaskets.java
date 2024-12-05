import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int maxLength = 0;
        int p1 = 0;
        int currentLength = 0;
        Map<Integer, Integer> fruitToSizeMap = new HashMap<>();

        for (int p2 = 0; p2 < fruits.length; p2++) {
            fruitToSizeMap.put(fruits[p2], fruitToSizeMap.getOrDefault(fruits[p2], 0) + 1);
            currentLength++;
            while (fruitToSizeMap.size() > 2) {
                fruitToSizeMap.put(fruits[p1], fruitToSizeMap.get(fruits[p1]) - 1);
                if (fruitToSizeMap.get(fruits[p1]) == 0) {
                    fruitToSizeMap.remove(fruits[p1]);
                }
                currentLength--;
                p1++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
