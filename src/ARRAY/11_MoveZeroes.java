package ARRAY;

class MoveZeroes {
    public static void main(String[] args) {

        int[] arr = {0,1,3,0,0,12};
        // next empty seat in the front
        int pos = 0; // --> Tells where the next non-zero element should go


        for (int i = 0 ; i<arr.length;i++){
            if (arr[i] != 0 ){
                arr[pos] = arr[i];
                pos ++;
            }
        }
        // abb non zero ka to kar liya lekin zero ka kya
        //arr = [1, 3, 12, ?, ?]
        //pos = 3
        while (pos<arr.length){ // “As long as we are still inside the array…”
            arr[pos] = 0 ; // “Put 0 at the current position”
            pos++; // “Move to the next position”
        }
    }
}
