package 两数之和;

import java.util.Arrays;

public class Text {
    public static int[] twoSum (int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i != j) {
                    if(numbers[i]+numbers[j] == target) {
                        return new int[]{i+1,j+1};
                    }
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
}
