class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int l=0,r=0,sum=0,max=0;
        while(r<nums.length){
            if(!set.contains(nums[r])){
                sum+=nums[r];
                set.add(nums[r]);
                max=Math.max(max,sum);
                r++;
            }
            else{
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
        }
        return max;
    }
}