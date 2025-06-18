class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int d=Math.abs(nums[0]-nums[n-1]);
        int max=d;
        int i=0;
        //System.out.println("the d "+d);
        for(int j=1;j<n;j++){
            int dif=Math.abs(nums[i]-nums[j]);
            if(dif>max) max=dif;
            
            i++;
            //System.out.println("the dif "+dif);
            //System.out.println("the max "+max);
        }
        return max;
    }
}