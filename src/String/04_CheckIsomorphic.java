package String;

import java.util.HashMap;


class CheckIsomorphic {
    public static void main(String[] args) {

        boolean Isomorphic = isIsomorphic("paper","title");
        System.out.println(Isomorphic);
    }
    public static boolean isIsomorphic(String s1,String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Character> map1 = new HashMap<>(); // map1 is used to remember the translations from s1 to s2
        HashMap<Character, Character> map2 = new HashMap<>(); // map2 is used to remember the translations from s2 to s1

        for (int i = 0 ; i<s1.length();i++) {  // this loop looks at both strings letter by letter
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map1.containsKey(c1)) { // Have we seen this letter from s1 before?
                if (map1.get(c1) != c2) { // If yes, does it map to the SAME letter in s2 as last time?
                    return false;  // // If it maps to a different letter, break the rule and fail
                }
            }else {
                    map1.put(c1,c2); // If we haven't seen it, record this new translation.
            }
            if (map2.containsKey(c2)) { // Have we seen this letter from s2 before?
                if (map2.get(c2) != c1) { // If yes, was it claimed by a DIFFERENT letter in s1?
                    return false; // If yes, break the rule and fail!
                }
            }else {
                    map2.put(c2,c1); // If we haven't seen it, record the reverse translation.
                }
        }
        return true;
    }
}
