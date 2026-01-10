package ARRAY;

import java.util.Scanner;

class FindMinimumElement {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];  // int arr[] ek he baat hai bas ye C-style hai
        System.out.println("enter the elements of array :");
        for (int i = 0; i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int min = arr[0];
        for (int i = 1 ; i<arr.length ; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("the minimum element is : " + min);
    }
}
