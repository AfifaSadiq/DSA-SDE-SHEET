class Solution {
    public void sortColors(int[] nums) {
        //better solution
        int c0=0, c1=0, c2=0, k=0;
        for(int i =0; i<nums.length; i++) {
            if(nums[i] == 0)
                c0 += 1;
            else if (nums[i] == 1)
                c1 += 1;
            else 
                c2 += 1;
        }
        for (int i = 0; i<c0; i++){
                nums[i] = 0;
                k++;
        }
        for (int i = k; i<c1+c0; i++){
                nums[i] = 1;
                k++;
        }
        for (int i = k; i<c2+c0+c1; i++){
                nums[i] = 2;
        }
           
    }
}
