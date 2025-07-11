class Solution {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        ArrayList<Integer> arr=new ArrayList<>();
        if(n==0){
            for(int k=0;k<m;k++){
                arr.add(nums1[k]);
            }
            return;
        }
        if(m==0){
            for(int l=0;l<m+n;l++){
                nums1[l]=nums2[l];
            }
            //printarr(arr);
            //System.out.println("m");
            return;
        }
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr.add(nums1[i]);
                i++;
            }
            else {
                arr.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            arr.add(nums1[i]);
            i++;
        }
        while(j<n){
            arr.add(nums2[j]);
            j++;
        }
        for(int k=0;k<arr.size();k++){
            nums1[k]=arr.get(k);
        }
        return;
    }
}