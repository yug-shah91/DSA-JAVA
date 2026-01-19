package ARRAY;

class BinaryFirstOccurrence {
    public static void main(String[] args) {

        int[] arr ={2,3,4,4,4,5,6};
        int target = 4 ;

        int left = 0;
        int right = arr.length - 1;
        int first = -1 ;
        // int last = -1;

        while (left<=right){
            int mid  = left + (right - left)/2 ;

            if (arr[mid] == target){
                first = mid ; // store answer
                right = mid -1 ;
                // for last occurrence
              //  last = mid;
               // last = mid + 1
            } else if (arr[mid]<target) {
                left = mid + 1;
            }else {
                right = mid - 1 ;
            }
        }
        System.out.println(first);

    }
}

//log n answers this question:
//
//How many times can I divide n by 2 before it becomes 1?

//Binary search is O(log n) because i    t discards half the array at every step.