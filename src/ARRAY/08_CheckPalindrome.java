package ARRAY;

class CheckPalindrome {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1};
        int left = 0 ;
        int right = arr.length -1 ;
        boolean palindrome = true;

        while (left<right){
            if (arr[left]!=arr[right]) { // == agar ye karte to logic galat ho jata
                // like ek ek pair check karke true kar deta aur palindrom me to sare pair same hone chaiye
                // ex: [1,2,3,4,1] yaha first aur last same hai agar == hota to vo true de deta aur apna galat ho jata
                // lrft++ aur right-- se kya he farak pad jata agar pehla he same aa gaya to vo true de he deta
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(palindrome);
    }
}
//DSA rule:
//It’s safer to detect failure early than success early.