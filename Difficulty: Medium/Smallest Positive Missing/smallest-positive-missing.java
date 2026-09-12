class Solution {
    public int missingNumber(int[] arr) {
        // code here
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int val:arr){
            set.add(val);
        }
        
        int k=1;
        while(set.contains(k)){
            k++;
        }
        return k;
    }
}
