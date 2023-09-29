import java.util.HashMap;
import java.util.Map;

public class FindNonUniqueDuplicate {
    public static Integer findNonUniqueDuplicate(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (countMap.get(num) > 1) {
                return num;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 4};
        Integer duplicate = findNonUniqueDuplicate(arr);
        if (duplicate != null) {
            System.out.println("Non-unique duplicate: " + duplicate);
        } else {
            System.out.println("No non-unique duplicates found.");
        }
    }
}
