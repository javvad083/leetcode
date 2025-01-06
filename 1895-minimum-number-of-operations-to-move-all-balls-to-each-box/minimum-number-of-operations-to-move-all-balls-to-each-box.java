class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int s=0;
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                    s=s+Math.abs(i-j);
                }
            }
            arr[i]=s;
        }
        return arr;
    }
}