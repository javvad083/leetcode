class Solution {

    public boolean isPalindrome(String s) {
        int n=s.length();
        int le=0, ri=n-1;
        while(le<ri){
            char l=s.charAt(le), r=s.charAt(ri);
            if(!Character.isLetterOrDigit(l)) le++;
            else if(!Character.isLetterOrDigit(r)) ri--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
            else{
                le++;
                ri--;
            }
        }
        return true;

    }
}