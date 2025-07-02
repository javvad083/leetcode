class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else{
            int n=x;
            int re=0;
            while(n>0){
                int l=n%10;
                re=(re*10)+l;
                n/=10;
            }
            if(re==x) return true;
        }
        return false;
    }
}