class Solution {
    public long sumAndMultiply(int n) {
        int x=0,sum=0,i=0;
        while(n>0){
            if((n%10) != 0){
            x=(n%10)*(int)(Math.pow(10,i))+x;
            sum=sum+(n%10);
            i++;
            }
            n=n/10;
        }
        System.out.println(x+" "+sum);
        return (long)x*sum;
    }
}