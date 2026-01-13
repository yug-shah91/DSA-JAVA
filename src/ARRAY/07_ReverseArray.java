package ARRAY;

// Two pointer technique
class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int left  = 0 ;
        int right = arr.length-1;

        while (left< right){ // warna same he aa jayega array
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;

            left ++ ; // aage to badhana padega na first aur last swap karne ke baad
            right -- ; // aur ye last se peeche ayega
        }
        for (int x : arr){
            System.out.print(x + " "); // ye array print kar dega saaray
        }
    }
}
//Time -->O(n)
//Space-->o(1)
/*
Two-pointer technique
Used in:
reverse
palindrome
pair problems
array rotation
You’ll see it a LOT.
 */