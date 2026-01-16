package ARRAY;

class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};  // Binary search only works on sorted arrays
        int target = 6 ; // This is the number we are searching for

        int left = 0 ; // left means: “From which INDEX should I start searching?”
        int right = arr.length - 1; //right means: end of the search range
        int result = -1; // assume not found

        while (left<=right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                System.out.println("found at index " + mid);
                break;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else {
                right = mid -1;
            }

        }
        System.out.println(result);
    }
}
