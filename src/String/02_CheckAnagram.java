package String;

class CheckAnagram { // Hashing / Frequency Counting
    public static void main(String[] args) {

        boolean anagram = isAnagram("listen", "silent");
        System.out.println(anagram);
    }

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[26];


        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            freq[c - 'a']++;
        }
        for (int j = 0; j < s2.length(); j++) {
            char c1 = s2.charAt(j);
            freq[c1 - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
