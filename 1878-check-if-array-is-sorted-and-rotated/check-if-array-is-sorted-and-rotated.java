class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int count=1;
        if(n==0 || n==1) return true;
        for(int i=0;i<2*n;i++){
            if(nums[i%n]<=nums[(i+1)%n]){
                count++;
            }
            else count=1;
            if(count == n){
                return true;
            }
        }
        //if(count==6) return true;
        return false;
    }
}