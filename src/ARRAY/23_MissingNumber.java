package ARRAY;

class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {3,0,1};
        int n = arr.length;

        int expectedSum= n*(n+1)/2;
        int actualSum=0;

        for (int x:arr){
            actualSum+=x;
        }
        int MissingNumber=expectedSum-actualSum;

        System.out.println(MissingNumber);
    }
}
