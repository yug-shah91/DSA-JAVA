package String;

class CountVowels {
    public static void main(String[] args) {

        String s = "Education";
        int count = 0;
        s=s.toLowerCase();
        for (int i = 0 ; i<s.length();i++){
                char c = s.charAt(i); // s.charAt(i) is a built-in Java tool that says, "Go to string s, look at position i, and hand me the character you find there."
            //System.out.print(c);
            if (c =='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                //System.out.print(c); // dirf vowel print karega word me
            }
        }
        System.out.println(count);
    }
}
