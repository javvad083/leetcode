class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int l=0;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for(int it:st){
            int count=1;
            if(!st.contains(it-1)){
                int x=it;
                while(st.contains(x+1)){
                    x=x+1;
                    count++;
                }
            }
            l=Math.max(l,count);
        }
        return l;
    }
}