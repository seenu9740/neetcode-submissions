class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalThreeSum = new ArrayList<>();
        if(nums.length == 3) {
            List<Integer> innerList = new ArrayList<>();
            int sum = 0;
            for(int n : nums) {
                innerList.add(n);
                sum+= n;
            }
            if(sum == 0)
            finalThreeSum.add(innerList);
        } else {
            Arrays.sort(nums);
            for(int i=0;i<nums.length-2;i++) {
                if(i > 0 && nums[i] == nums[i-1]) continue;
                int j = i+1, k = nums.length-1;
                while(j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0) {
                        finalThreeSum.add(Arrays.asList(nums[i], nums[j], nums[k]));
                       while(j < k && nums[j] == nums[j+1]) j++;
                       while(j < k && nums[k] == nums[k-1]) k--;
                       j++; k--;
                    } else if(sum > 0) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return finalThreeSum;
    }
}
