package ARRAY;

class BinarySearchInsertPosition {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};
        int target = 2 ;

        int left = 0 ;
        int right = arr.length -1 ;

        while (left<=right){
            int mid = left + (right - left ) / 2 ;

            if (arr[mid]==target){
                System.out.println(mid);
                break;
            } else if (arr[mid]<target) {
                left = mid + 1 ;
            }else {
                right = mid -1 ;
            }
        }
        //if not found
        System.out.println(left);
    }
}
