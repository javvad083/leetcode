class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl=0;
        int[] fre=new int[128];
        int l=0;
        for(int r=0;r<s.length();++r){
            char cha=s.charAt(r);
            ++fre[cha];

            while(fre[cha]>1){
                char lc=s.charAt(l);
                --fre[lc];
                l++;
            }

            maxl=Math.max(maxl,r-l+1);
        }
        return maxl;
    }
}