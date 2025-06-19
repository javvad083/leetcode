class Solution {
    public int maxDifference(String s) {
        char[] arr=s.toCharArray();
        int[] count=new int[26];
        int max=0;
        //int min=0;
        int min=s.length();
        for(final char c:arr){
            count[c-'a']=count[c-'a']+1;
        }
        for(final int f:count){
            if(f==0) continue;
            if(f%2==0){
                min=Math.min(min,f);
            }
            else{
                max=Math.max(max,f);
            }
        }
        return max-min;
    }
}