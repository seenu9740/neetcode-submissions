class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> noDupSet = new HashSet<>();
        for(int num : nums) {
            noDupSet.add(num);
        }
       if(noDupSet.size() == nums.length) return false;
       else return true;
    }
}