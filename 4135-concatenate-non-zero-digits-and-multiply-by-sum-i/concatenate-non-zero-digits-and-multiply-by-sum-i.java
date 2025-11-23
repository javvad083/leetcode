class Solution {
    public int x=0,sum=0;
    public long sumAndMultiply(int n) {
        if(n<=0) return 0;
        if(n%10 != 0){
        sum=sum+(n%10);
        sumAndMultiply(n/10);
        x=x*10+(n%10);
        }
        if(n%10==0){
            sumAndMultiply(n/10);
        }
        return (long) x*sum;
        
    }
}