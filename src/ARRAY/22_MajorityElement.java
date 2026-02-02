package ARRAY;

class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {3,3,1,3,1,3,3};
        int candidate  = 0;
        int count = 0 ;

        for (int x : arr){
            if (count == 0){
                candidate = x ;
            }
            if (candidate == x){
                count++;
            }else {
                count--;
            }

        }
        System.out.println(candidate);
        }
    }
