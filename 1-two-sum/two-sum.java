class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] ans=new int[2];
        int n=nums.length;
        //int sum=arr[0];
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(mp.containsKey(rem)){
                ans[0]=mp.get(rem);
                ans[1]=i;
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}