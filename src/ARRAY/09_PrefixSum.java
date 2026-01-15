package ARRAY;

class PrefixSum {
    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5};  //{1,3,6,10,15}
        int[] prefix  = new int[arr.length];  //just a helper array to store the sum

        prefix[0] = arr[0] ;

        for (int i= 1 ; i<arr.length ; i++){
            prefix[i]= prefix[i-1] + arr[i];
        }
        for (int x : prefix){
            System.out.println(x);
        }
    }
}
// time--> o(n)
// space--> o(n) as we created an extra array of size n

/*
int[] prefix = new int[arr.length];
This line just means:
“Create a new empty array
where I will store the running sums.”

WHY SAME SIZE AS arr?

Because:
arr[0] → sum till index 0 → needs a place
arr[1] → sum till index 1 → needs a place
arr[2] → sum till index 2 → needs a place

So you need:
same number of boxes

That’s why:
new int[arr.length]
 */