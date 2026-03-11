package String;

class CharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(LongestRepeating(s));
    }

    public static int LongestRepeating(String s){

        int maxfreq = 0;
        int left = 0;
        int right ;
        int k = 1;
        int maxLength = 0;
        int[] freq = new int[128];

        for (right = 0 ; right<s.length();right++) {
            char c = s.charAt(right);
            freq[c - 'A']++;

            maxfreq = Math.max(maxfreq, freq[c - 'A']); //right-left+1 -->window size

            while ((right-left+1) - maxfreq > k) {
                char leftchar = s.charAt(left);
                freq[leftchar - 'A']--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
