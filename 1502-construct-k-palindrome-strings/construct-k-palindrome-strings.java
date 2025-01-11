class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        int[] f=new int[26];
        char[] a=s.toCharArray();
        for(char c:a){
            f[c-'a']++;
        }
        int of=0;
        for(int i=0;i<26;i++){
            if(f[i]%2!=0){
                of++;
            }
        }
        if(of<=k) return true;
        else return false;
    }
}