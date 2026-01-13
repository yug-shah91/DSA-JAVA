package ARRAY;

class SecondMax {
    public static void main(String[] args) {
//        2 Pass way Time-->O(n^2)
//        int[] arr = {4,7,1,9,3};
//        int max =0 ;
//        int secondmax = 0 ;
//
//         for (int i = 0 ; i<arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         for (int i = 0 ; i<arr.length  ; i++){
//             if (max > arr[i] && arr[i]>secondmax){
//                 secondmax=arr[i];
//
//             }
//         }
//        System.out.println(max);
//        System.out.println(secondmax);

        //One Pass Way Time--->O(n)

        int[] arr = {4,9,1,9,3};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>secondmax) {
                secondmax=arr[i];
            }
        }
        if (secondmax == Integer.MIN_VALUE){ // Edge cases :[5,5,5] [7]
            System.out.println("second max does not exist");
        }else {
            System.out.println(secondmax);
        }
    }
}
