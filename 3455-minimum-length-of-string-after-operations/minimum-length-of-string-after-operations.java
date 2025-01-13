class Solution {
    public int minimumLength(String s) {
        int[] f=new int[26];
        for(char c:s.toCharArray()){
            f[c-'a']++;
        }
        int count=0;
        for(int i:f){
            if(i>0){
                count += i % 2 == 1 ? 1 : 2;
}
        }
        return count;
    }
}