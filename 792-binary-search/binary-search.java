class Solution {
    public static int bs(int[] arr,int low,int high,int k){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==k) return mid;
        else if(arr[mid]>k) return bs(arr,low,mid-1,k);
        return bs(arr,mid+1,high,k);
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int ans=bs(nums,0,n-1,target);
        return ans;
    }
}