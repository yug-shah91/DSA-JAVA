package ARRAY;

class KadaneAlgo {
    public static void main(String[] args) {

        int[] arr = {1,-2,3,5,-1,-5,3,2,-6,-1,1};

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0 ;

        for(int num : arr){
            currentSum += num;
            if (currentSum>maxSum){
                maxSum=currentSum;
            }
            if (currentSum<0){
                currentSum=0;
            }
        }
        System.out.println(maxSum);
    }
}
