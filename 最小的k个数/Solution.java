package 最小的k个数;

import java.util.*;


public class Solution {
    //排序
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] array = new int[k];

        for (int i = 0; i < k; i++) {
            array[i] = arr[i];
        }
        return array;
    }

    //堆
    public int[] getLeastNumbers1(int[] arr, int k) {
        int[] vec = new int[k];
        if (k == 0) { // 排除 0 的情况
            return vec;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });
        for (int i = 0; i < k; ++i) {
            queue.offer(arr[i]);
        }
        for (int i = k; i < arr.length; ++i) {
            if (queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; ++i) {
            vec[i] = queue.poll();
        }
        return vec;
    }
}

