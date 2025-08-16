class Solution {
    public static int findmax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }
        return max;
    }
    public static int hours(int[] arr,int m){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=Math.ceil((double) (arr[i])/(double)(m));
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=findmax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int hr=hours(piles,mid);
            if(hr<=h){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}