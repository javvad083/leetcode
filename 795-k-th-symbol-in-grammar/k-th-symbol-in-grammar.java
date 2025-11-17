class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1 && k==1){
            return 0;
        }
        //System.out.print(n+" "+k+" | ");
        int mp= 1<<(n-2);
        if(k<=mp){
        return kthGrammar(n-1,k);
        }
        return kthGrammar(n-1,k-mp)^1;
    }
}