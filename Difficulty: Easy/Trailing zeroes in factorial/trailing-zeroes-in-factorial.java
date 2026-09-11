class Solution {
    public static int trailingZeroes(int n) {
        // code here
        int zero = 0;
        while(n>0){
            n/=5;
            zero += n;
        }
        return zero;
    }
}