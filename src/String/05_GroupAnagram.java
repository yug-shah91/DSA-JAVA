package String;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagram {
    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","bat","nat"};

        List<List<String>> result  = groupAnagrams(strs);

        System.out.println(result);

    }

    public static List<List<String>> groupAnagrams(String[] strs){

        HashMap<String,List<String>>map = new HashMap<>();

        for (String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>()); // Creates an empty list when key doesn’t exist.
            }

            map.get(key).add(word); // Adds the original word to that list.
        }
        return new ArrayList<>(map.values()); // kyuki hame hapmap return nai karana list return karvani hai isliye aise likha hai
    }
}
//List<List<String>>
//List  → contains multiple groups
//Each group → is also a List<String>