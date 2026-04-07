class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int n: nums) {
            countMap.put(n, countMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b) -> countMap.get(a) - countMap.get(b)
        );

        for(int num : countMap.keySet()) {
            heap.offer(num);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] kElement = new int[k];
        for(int i=k-1;i>=0;i--){
            kElement[i] = heap.poll();
        }
        return kElement;
    }
}
