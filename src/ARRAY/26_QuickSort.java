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

        int pivit = arr[high];
        int i = low;

        for (int j = low ; j<high ; j ++){

            if (arr[j]<pivit){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i ;
    }


}
