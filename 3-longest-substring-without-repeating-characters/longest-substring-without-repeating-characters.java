class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl=0;
        int[] fre=new int[128];
        int l=0;
        //char lc=s.charAt(l);
        for(int r=0;r<s.length();++r){
            //char cha=s.charAt(r);
            ++fre[s.charAt(r)];

            while(fre[s.charAt(r)]>1){
                --fre[s.charAt(l)];
                l++;
            }

            maxl=Math.max(maxl,r-l+1);
        }
        return maxl;
    }
}