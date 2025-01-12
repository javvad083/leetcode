class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        int j;
        for(int i=0;i<grid.length;i++){
            if(i%2!=0) j=grid[i].length-1;
            else j=0;
            while(j>=0 && j<grid[i].length){
                if((i+j)%2==0) ar.add(grid[i][j]); 
                if(i%2!=0) j--;
                else j++;
            }
        }
        return ar;
    }
}