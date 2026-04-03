class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> newList = new ArrayList<>();
        Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        if(newList.contains(nums[i])){
            return true;
        } else {
            newList.add(nums[i]);
        }
       }
       return false;
    }
}