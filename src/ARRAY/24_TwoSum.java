package ARRAY;

import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {

        int[] arr = {1,7,4,2,5,6};
        int target = 9 ;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0 ; i<arr.length;i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices : "+map.get(complement)+","+i);
                return;
            }
            map.put(arr[i],i);
        }
    }
}
