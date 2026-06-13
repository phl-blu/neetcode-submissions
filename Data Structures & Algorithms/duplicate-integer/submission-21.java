
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> arr = new HashMap<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (arr.containsKey(nums[i])){
                return true;
            }
            arr.put(nums[i],j);
            j++;
        }
        return false;
    }
}