package String;


class LongestSubstring {
    public static void main(String[] args) {

        String s = "abbabcad";
        System.out.println( maxLength(s));
      }
    public static int maxLength (String s){

        int left = 0 ;
        int right ;
        int max = 0 ;
        int[] freq = new int[26];

        for (right = 0 ; right<s.length();right++){
            char c  = s.charAt(right);
            freq[c-'a']++;
            while (freq[c-'a'] > 1){
                char leftchar = s.charAt(left);
                freq[leftchar-'a']--;
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}






//As the right pointer moves, the window size changes constantly. Sometimes it grows, and sometimes (when you hit a duplicate) the left pointer moves up and the window shrinks.
//
//max: This variable stores the "World Record" (the longest valid substring found so far).
//
//right - left + 1: This is the "Current Score" (the length of the current valid window).
//
//The Math.max function compares the two. If the "Current Score" is higher than the "World Record," it updates the record. If the current window is smaller, it keeps the old record.