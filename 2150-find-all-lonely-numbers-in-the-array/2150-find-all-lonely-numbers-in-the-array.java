class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            int value = entry.getKey();
            if(entry.getValue() == 1 && !map.containsKey(value+1) && !map.containsKey(value-1)){
                ans.add(value);
            }
        }

        return ans;
    }
}