package String;

class KDistinctCharacter {
    public static void main(String[] args) {
        String s = "aaaabbccd";
        System.out.println(maxLength(s));
    }
    public static int maxLength(String s){

        int left = 0 ;
        int right ;
        int[] freq = new int[26];
        int k = 2 ;
        int distinct = 0;
        int max = 0;

        for (right = 0 ; right<s.length();right++) {
            char c = s.charAt(right);
            freq[c - 'a']++;

            if (freq[c - 'a'] == 1) {
                distinct++;
            }

            while (distinct > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;

                if (freq[leftChar - 'a'] == 0) {
                    distinct--;
                }
                left++;
            }
            max = Math.max(max,right - left +1);
        }
        return max;
    }
}
