class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length == 3) {
            if(nums[0] + nums[1] > 0) {
                return finalList;
            } else {
                finalList.add(Arrays.asList(nums[0], nums[1], nums[2]));
                return finalList;
            }
        }
        
        
        for(int i=0; i < nums.length-2 ; i++) {
            if(i>0 && nums[i] == nums[i-1]) i++;
            int j=i+1, k=nums.length-1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> innerList = Arrays.asList(nums[i], nums[j], nums[k]);
                    if(!finalList.contains(innerList)) {
                        finalList.add(innerList);
                    }
                    j++; k--;
                } else if(sum > 0) {
                    k--;
                } else {
                    j++;
                }

            }


        }
        return finalList;


    }
}
