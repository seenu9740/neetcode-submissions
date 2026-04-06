class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> noDupSet = new ArrayList<>();
        for(int num : nums) {
            if(noDupSet.contains(num)) {
                return true;
            }
                noDupSet.add(num);
        }
      return false;
    }
}