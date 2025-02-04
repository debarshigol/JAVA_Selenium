import java.util.ArrayList;
import java.util.List;

public class ArraySumMod {

    public static void main(String[] args) {
        int[] arr = {6, 8, 11, 6, 7, 18};
        int target = 17;
        List<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                int index1 = i;
                int numLeft = target - arr[i];
                if (arrList.contains(numLeft)) {
                    int index2 = arrList.indexOf(numLeft);
                    if (index1 != index2) {
                        System.out.println("Index of 2 elements, which sum are equal to target: " + index1 + " and " + index2);
          
                    }
                }
            }
        }
    }
}
