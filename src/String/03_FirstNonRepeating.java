package String;

class FirstNonRepeating {
    public static void main(String[] args) {
        int index = FirstUniqueElement("leetcode");
        System.out.println(index);

    }
    public static int FirstUniqueElement(String s){

        int[] freq = new int[26];
        for (int i = 0 ; i <s.length() ; i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        for (int i = 0 ; i<26 ; i++){
            if (freq[s.charAt(i) - 'a'] == 1){
                return i ;
            }
        }
        return -1;
    }
}
