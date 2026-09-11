class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> lst=new ArrayList<>();
        
        int leader=arr[n-1];
        lst.add(leader);
        for(int i=n-2;i>=0;i--){
            if(leader<=arr[i]){
                lst.add(arr[i]);
                leader=arr[i];
            }
        }
        //lst.add(arr[n-1]);
        Collections.reverse(lst);
        return lst;
    }
}
