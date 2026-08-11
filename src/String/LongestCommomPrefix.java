package String;

class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower" , "flow" , "flight"};
        System.out.print(prefix(strs));

    }

    public static String prefix(String[] strs){

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            for (int j = 1; j < strs.length; j++) {

                if (i>= strs[j].length() || first.charAt(i) != strs[j].charAt(i)){// if string is to short or character are different then return everything before that

                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}
