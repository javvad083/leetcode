class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
         long res=0;
        int n=nums.length;
        //[start,end,value]
        ArrayDeque<int[]> deque = new ArrayDeque<>();
        long curTotal=0;
        //单调栈
        for (int i = n - 1; i >= 0; i--) {
            int end=i;
            while (!deque.isEmpty()&&deque.peekFirst()[2]<nums[i]){
                int[]pre=deque.pollFirst();
                end=pre[1];
                curTotal+=(1L*(nums[i]-pre[2])*(pre[1]-pre[0]+1));
            }
            deque.addFirst(new int[]{i,end,nums[i]});
            while (curTotal>k){
                int[]last=deque.peekLast();
                int newEnd=last[1];
                while (newEnd>=last[0]&&curTotal>k){
                    curTotal-=(last[2]-nums[newEnd]);
                    newEnd--;
                }
                if(newEnd<last[0]){
                    deque.pollLast();
                }else {
                    last[1]=newEnd;
                }
            }
            res+=(deque.peekLast()[1]-i+1);
        }
        return res;
    }
}