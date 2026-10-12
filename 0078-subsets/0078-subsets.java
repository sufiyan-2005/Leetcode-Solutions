class Solution {
    public void findallSubsets(List<List<Integer>> allAns , List<Integer> ans , int i , int[] nums){
        if(i == nums.length){
            allAns.add(new ArrayList<>(ans));
            return;
        }
        //include choice
            ans.add(nums[i]);
            findallSubsets(allAns , ans , i+1 , nums);

            ans.remove(ans.size() - 1);
            findallSubsets(allAns , ans , i+1 , nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allAns = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        findallSubsets(allAns , ans , 0 , nums);
        return allAns;
    }
}