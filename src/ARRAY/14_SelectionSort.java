package ARRAY;

class SelectionSort {
    public static void main(String[] args) {

        int[] arr={2,5,4,8,7,9};

        for (int i = 0 ; i<arr.length ; i++) { // decides where the next smallest element should go
            int minindex = i; // stores index of smallest value found

            for (int j = i + 1; j < arr.length - 1; j++) { // searches for smallest element after i
                if (arr[j]<arr[minindex]){
                    minindex = j ;
                }
            }
            int temp = arr[minindex]; // puts smallest element in correct position
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
//Time: O(n²) (nested loops)
//
//Space: O(1) (in-place)