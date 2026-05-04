class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
       int n = nums.length;
       int appearances = n/2;
       int curr = 0;
       for (int i = 0; i < n; i++){
         if (curr == nums[i]){
            appearances--;
         } else {
            appearances = n/2;
         }
         
         if (appearances == 0){
            return nums[i];
         }
         curr = nums[i];
       }
        return 0;
    }
}