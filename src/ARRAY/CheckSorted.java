package ARRAY;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        boolean check = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]){
                check=true;
            }
        }
        System.out.println(check);
    }
}
