class Solution {
    static{
        for(int i=0;i< 300;i++){
            findMaxConsecutiveOnes(new int[]{0});
        }
    }
    static public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(count,max);
            }
            else count=0;
        }
        return max;
    }
}