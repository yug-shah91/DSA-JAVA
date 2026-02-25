package ARRAY;

class QuickSort {

    public static void main(String[] args) {

        int[] arr = {2,7,4,6};


        quickSort(arr,0, arr.length-1);

        for (int x : arr){
            System.out.print(x+" ");
        }
    }

    static void quickSort(int[] arr,int low , int high){

        if (low<high){

            int pivotIndex = partition(arr,low,high);

            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);

        }
    }

    static int partition(int[] arr,int low, int high){

        int pivot = arr[high];  // Pick last element.
        int i = low; // i marks next small position.

        for (int j = low ; j<high ; j ++){ // Scan until element before pivot.

            // If element is smaller:
            if (arr[j]<pivot){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++; // Swap arr[i] and arr[j], then i++.
            }
        }
        //After loop
        //Swap pivot with arr[i].
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i ;
    }


}
