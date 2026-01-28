package ARRAY;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        int pos = 1 ;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]){
                arr[pos] = arr[i];
                pos++;
            }
        }
        for (int i = 0; i <pos ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//Compare with previous, place at pos, move forward.
//
//This same idea appears in:
//removing duplicates
//filtering arrays
//compressing data