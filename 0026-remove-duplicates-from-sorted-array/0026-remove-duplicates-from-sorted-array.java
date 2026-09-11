class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
    
           for(int i = 1; i < nums.length; i++){
             if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                 k = k + 1;
        }
    }

         return k;
 }
}


// k is both:

// The index where the next unique element is written.
// The final count of unique elements.