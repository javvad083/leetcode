class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int m=0;
        for(int i=0;i<=n;i++){
            int k=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    k=1;
                    break;
                }
            }
            if(k==0) m=i;
        }
        return m;
    }
}