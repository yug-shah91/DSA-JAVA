package ARRAY;

class MergeSort {
    public static void main(String[] args) {

        int[] arr = {1,4,2,5};

        mergeSort(arr,0, arr.length-1 );

        for (int x:arr){
            System.out.print(" "+x);
        }
    }
    static void mergeSort(int[] arr, int left , int right){

        if (left>=right)return;

        int mid = (left+right)/2;

        mergeSort(arr, left, mid);
        mergeSort(arr,mid+1,right);

        merge(arr,mid,left,right);
    }

    static void merge(int[] arr ,int mid, int left, int right){

        int[] temp = new int[right-left+1];

        int i  = left;
        int j = mid +1;
        int k = 0;

        while (i<= mid && j<=right){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else {
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while (i<= mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while (j<=right){
            temp[k]=arr[j];
            j++;
            k++;

        }
// Loop through the TEMP array.
        // NOTE: In your original code, you used p < arr.length, which caused the crash.
        // We must use p < temp.length because we only want to copy the specific range we just merged.
        for (int p = 0 ; p<temp.length;p++){
            arr[left+p]=temp[p];
        }

    }
}
