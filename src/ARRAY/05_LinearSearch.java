package ARRAY;

class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {4,7,1,9,3};
        int target = 0;
        int index = -1 ;
        boolean found =false;

        for (int i = 0 ;i<arr.length;i++){
            if (arr[i] == target){
                index = i ;
                found= true; // ---> ye galti thi mene print("true") karke print karvaya
                //jab output me t/f poocha ho mtlb aise print nai karna computer decision lega
                //System.out.println("the index is " + i);
                break;
            }
        }
        System.out.println(index);
        System.out.println(found);
    }
}
//But in real problems, usually you do one of these, not both: index , and search
// Time --> o(n)
// space --> o(1)