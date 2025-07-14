class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int l=0,r=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                arr[r]=nums[i];
                r--;
            }
            else{
                arr[l]=nums[i];
                l++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}