class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i=0; i<numbers.length; i++) {
            if(indexMap.containsKey(numbers[i])) {
                continue;
            } else {
                indexMap.put(numbers[i],i);
            }
        }

        for(int i=0; i<numbers.length; i++) {
            int result= target-numbers[i];
            if(indexMap.containsKey(result)) {
                return new int[]{i+1, indexMap.get(result)+1};
            }
        }
       return null;
    }
}
