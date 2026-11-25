class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(nums[0]);
        for(int i = 1; i < nums.length; i = i + 1){
            int num = nums[i];
            Integer vLow = set.floor(num);

            if(vLow != null && (num - vLow) <= valueDiff){
                return true;
            }

            Integer vHigh = set.ceiling(num);
            if(vHigh != null && (vHigh - num) <= valueDiff){
                return true;
            }

            set.add(num);
            if(i - indexDiff >= 0){
                set.remove(nums[i - indexDiff]);
            }
        }

        return false;
    }
}