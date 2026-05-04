class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int appearance = n/2;
        int count = 1;                     // first element already seen
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > appearance) return nums[i];
            } else {
                count = 1;
            }
        }
        return nums[0];
    }
}