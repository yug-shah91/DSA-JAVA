package ARRAY;

class CountOccurrences {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of array : ");
//        int size = input.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the elements of array :");
//        for (int i = 0 ; i<arr.length;i++){
//            arr[i]=input.nextInt();
//        }
        int[] arr = {1,2,3,2,2,4};
        int target = 2 ;
        int count = 0;
  /*
           for (int i =0;i<arr.length;i++){
           }
   */
//        System.out.println("enter the number n you want to find the occurrence of : " );
//        int n = input.nextInt();

        for(int i : arr){
            if ( i == target){   //arr[i] == 2
                count++;
            }
        }
        System.out.println("the number of occurrences are : " + count);
    }
}
/*👉 “Traverse + Compare / Update” pattern

General idea:
        1️⃣ Go through array one by one
2️⃣ Keep some variable
3️⃣ Update it based on condition
 */