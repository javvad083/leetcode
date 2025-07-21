class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            int l=0,r=n-1;
        while(l<=r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
        return;
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int t=nums[i];
                nums[i]=nums[ind];
                nums[ind]=t;
                break;
            }
        }
        int l=ind+1,r=n-1;
        while(l<=r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
    }
}