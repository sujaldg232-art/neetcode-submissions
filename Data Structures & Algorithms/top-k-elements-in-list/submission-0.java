class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0; i <nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
    }

    List<Integer> sorted = new ArrayList<>(map.keySet());
    sorted.sort((a, b) -> map.get(b).compareTo(map.get(a)));

    int[] res = new int[k];
    for(int i = 0; i < k;i++){
        res[i]= sorted.get(i);
    }

    return res;
    }
}
