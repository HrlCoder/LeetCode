package 数组.数组中值出现了一次的数字;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] arr1 = new int[2];
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            for(int i = 0; i < arr.length; i++) {
                if(map.containsKey(arr[i])) {
                    map.put(arr[i],map.get(arr[i])+1);
                } else {
                    map.put(arr[i],1);
                }
            }
            int k = 0;

            for(Integer key : map.keySet()) {
                if(map.get(key) % 2 != 0) {
                    arr1[k] = key;
                    k++;
                }
            }
            Arrays.sort(arr1);
            System.out.println(arr1[0]+" "+arr1[1]);
        }
    }
}
