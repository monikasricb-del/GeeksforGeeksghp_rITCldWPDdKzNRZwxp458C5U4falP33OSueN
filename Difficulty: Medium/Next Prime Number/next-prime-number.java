class Solution {
    public static int nextPrime(int n) {
        int next = n+1;
        while(true){
            if(isPrime(next)){
                return next;
            }
            next++;
        }
    }
    
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}