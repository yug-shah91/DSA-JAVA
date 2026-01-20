package ARRAY;

class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5,3,7,1,2,4};
        int n = arr.length;

        // outer loop for number of passes
        for (int i = 0 ; i< n-1;i++){
            // inner loop for comparing adjacent element
            for (int j = 0 ; j<n-1-i;j++){

                if (arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
        for (int x : arr){
            System.out.print(x );
        }
    }
}
//Time: O(n²)
//(nested loops)

//Space: O(1)
//(no extra array)