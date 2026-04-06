package LinkedList;

class IsHappy {

    public int square(int n){
        int ans = 0 ;

        while (n>0){
            int digits = n%10;
            ans += digits*digits;
            n /= 10;
        }
        return ans;
    }

    public Boolean isHappy(int n){

        int fast = n;
        int slow = n;

        do{
            slow = square(slow);
            fast = square(square(fast));
        }while (slow!=fast);

        if (slow == 1){
            return true;
        }
        return false;
    }
}
