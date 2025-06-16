class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>=nums[j]) continue;
                else{
                    int d=nums[j]-nums[i];
                    if(d>max) max=d;
                }
            }
        }
        if (max>0) return max;
        else return -1;
    }
}