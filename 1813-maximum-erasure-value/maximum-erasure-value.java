class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int sum=0,max=0,l=0;
        for(int i=0;i<n;i++){
            int v=nums[i];
            if(mp.containsKey(v) && mp.get(v)>=l){
                int j=mp.get(nums[i]);
                while(l<=j){
                    sum-=nums[l];
                    l++;
                }
            }
            sum+=nums[i];
            mp.put(nums[i],i);
            max=Math.max(sum,max);
        }
        return max;
    }
}