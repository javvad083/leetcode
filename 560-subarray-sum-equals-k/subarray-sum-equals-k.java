class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        mp.put(0,1);
        int sum=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int r=sum-k;
            cnt+= mp.getOrDefault(r,0);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}