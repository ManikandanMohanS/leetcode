class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int k=0;
        for(int i=0;i<n;i++){
           nums1[i+m]=nums2[i];
        
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}