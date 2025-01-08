class Solution {
    public boolean isPrefixAndSuffix(String str1,String str2){
        int m=str2.length(),n=str1.length();
        int c=0;
        /*if(str1==str2){
            return true;
        }*/
        if(n<=1) {
            if(str1.charAt(0)==str2.charAt(0) && str1.charAt(0)==str2.charAt(m-1) ){
                return true;
            }
            else return false;
        }
        else{
        for(int i=0;i<n;i++){
            if(str1.charAt(i)!=str2.charAt(i) || str1.charAt(n-i-1)!=str2.charAt(m-i-1)){
                System.out.println(str1.charAt(i)+" "+str2.charAt(i));
                System.out.println(str1.charAt(n-i-1)+" "+str2.charAt(m-i-1));
                //c++;
                //System.out.println("count "+c);
                return false;
            }
        }
        }
        //return true;
        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                int k=words[i].length();
                int r=words[j].length();
                if(k<=r){
                    boolean q=isPrefixAndSuffix(words[i],words[j]);
                    System.out.println(" "+q);
                    if(q){
                        count++;
                    }
                }
                else continue;
            }
        }
        return count;
    }
}