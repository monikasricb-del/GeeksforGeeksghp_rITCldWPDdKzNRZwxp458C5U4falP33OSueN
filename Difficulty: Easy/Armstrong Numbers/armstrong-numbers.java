import java.util.*; 
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int sum = 0;
        //boolean ans = false;
        while(n > 0)
        {
            int rem = n % 10;
            double pow = Math.pow(rem,3);
            sum += pow;
            n/=10;
        }
        if(sum == temp)
        {
            return true;
        }
        return false;
    }
}