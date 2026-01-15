package ARRAY;

// the real goal is to find among all subarray of size k=3 which has the maximum sum
class SlidingWindow {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6}; // array define
        int k = 3 ; // ek baar me window me kitne element aa sakte hai

        int windowSum = 0;  // intially to sum 0 he rahega na

        // pehla loop first 3 elemet ke sum find karne ke liye
        for (int i = 0 ; i < k ; i++){
            windowSum += arr[i];
        }
        int maxSum = windowSum;  // window ka sum jo aaya vo kahi to store karna padega na

        // dusra loop window ko aage badhane ke liye ek elemnet add karenge aage wala aur peeche wala nikalenge

        for (int i = k ; i < arr.length ; i++){
            // Purane sum mein naya element add karo, aur pichla element nikalo
            windowSum = windowSum + arr[i] - arr[i-k];

            // Har step pe check karo ki kya ye naya sum bada hai?
            if (windowSum > maxSum){
                maxSum=windowSum;
            }
        }

        System.out.println(maxSum);
    }
}
