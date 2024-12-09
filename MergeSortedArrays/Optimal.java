class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1, right =0, temp;
        while(left>=0 && right<n) {
            if(nums1[left]>nums2[right]) {
                temp = nums1[left];
                nums1[left--] = nums2[right];
                nums2[right++] = temp;
            }
            else {
                break;
            }
        }
        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2);

        for(int i=0; i<n;i++){
            nums1[i+m] = nums2[i];
        }
    }
}
