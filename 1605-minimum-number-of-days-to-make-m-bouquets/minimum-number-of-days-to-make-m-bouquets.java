class Solution {
    public static int[] mint(int[] arr){
        int[] ans=new int[2];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
            if(min>arr[i]) min=arr[i];
        }
        ans[0]=min;
        ans[1]=max;
        return ans;
    }
    public static boolean bloomed(int[] arr,int m,int k,int mid){
        int n=arr.length;
        int count=0;
        int total=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                total+=count/k;
                count=0;
            }
        }
        total+=count/k;
        if(total>=m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int[] arr=mint(bloomDay);
        int l=arr[0],h=arr[1];
        int ans=-1;
        if(bloomDay.length<(long)(m*k)) return -1;
        while(l<=h){
            int mid=(l+h)/2;
            if(bloomed(bloomDay,m,k,mid)){
                ans=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
}