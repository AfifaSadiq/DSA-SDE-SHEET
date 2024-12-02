class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1, temp;
        int len = nums.length;
        //finding breakpoint
        for(int i=len-1; i>0; i--){
            if(nums[i]> nums[i-1]){
                index = i-1;
                break;
            }
        }
        if(index  == -1){
            reverseArray(nums, 0, len-1);
            return;
        }
        //finding next greater integer of nums[index];
        for(int j=len-1; j>index; j--) {
            if(nums[j] > nums[index]){
                //swapping 
                temp = nums[index];
                nums[index] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        //reversing 
        reverseArray(nums, index+1, len-1);
    }
    public void reverseArray(int[] arr, int startIdx, int endIdx) {
        while (startIdx < endIdx) {
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }
}
