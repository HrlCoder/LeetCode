package 旋转数组的最小数字;

public class Solution {
    public int minArray(int[] numbers) {
        int num = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < num) {
                num = numbers[i];
            }
        }
        return num;
    }
}
