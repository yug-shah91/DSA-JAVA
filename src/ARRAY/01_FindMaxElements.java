package ARRAY;

import java.util.Scanner;

class FindMaxElements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of array ");

        for(int i = 0 ; i<arr.length;i++){
                arr[i]= input.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
/*👉 “Traverse + Compare / Update” pattern

General idea:
        1️⃣ Go through array one by one
2️⃣ Keep some variable
3️⃣ Update it based on condition
 */