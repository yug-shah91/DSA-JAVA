package ARRAY;

class SumOfElements {
    public static void main(String[] args) {

        int[] arr = {5,5,5};
        int sum = 0 ;

        for(int i : arr){
            sum += i ;
        }
        System.out.println(sum);
    }
}
/*👉 “Traverse + Compare / Update” pattern

General idea:
        1️⃣ Go through array one by one
2️⃣ Keep some variable
3️⃣ Update it based on condition
 */