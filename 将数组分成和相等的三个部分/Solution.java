package 数组.将数组分成和相等的三个部分;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/1 10:41
 */
public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        //求A中所有数的和
        for (int i : A) {
            sum += i;
        }
        //如果不能被3整除，说明不能分成三份
        if(sum%3 != 0) {
            return false;
        }

        //双指针求解
        int left = 0;
        int right = A.length-1;
        int leftSum = A[left];
        int rightSum = A[right];

        // 使用left + 1 < right 的原因，防止只能将数组分成两个部分
        // 例如：[1,-1,1,-1]，使用left < right作为判断条件就会出
        while (left+1 < right) {
            if(leftSum == sum/3 && rightSum == sum/3) {
                // 左右两边都等于 sum/3 ，中间也一定等于
                return true;
            }
            if(leftSum != sum/3) {
                leftSum += A[++left];
            }
            if(rightSum != sum/3) {
                rightSum += A[--right];
            }
        }
        return false;
    }
}
