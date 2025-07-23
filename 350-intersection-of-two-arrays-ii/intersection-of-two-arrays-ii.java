class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        //int n=Math.min(n1,n2);
        int i=0,j=0;
        ArrayList<Integer> arr= new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans=new int[arr.size()];
        for(int q=0;q<arr.size();q++){
            ans[q]=arr.get(q);
        }
        return ans;
    }
}