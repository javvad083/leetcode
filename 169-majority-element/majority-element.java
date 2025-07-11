class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        Integer max=nums.length/2;
        Integer count=0;
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue()>max) count=entry.getKey();
        }
        return count;
    }
}