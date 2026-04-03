class Solution {
    public int[] twoSum(int[] nums, int target) {   
     Map<Integer, Integer> sumMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sumMap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(sumMap.containsKey(target-nums[i]) && sumMap.get(target-nums[i]) != i){
                return new int[]{i, sumMap.get(target-nums[i])};
            }
        }
        return null;
    }
}
