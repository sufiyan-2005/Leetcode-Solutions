class Solution {
     public void getAllSubsets(List<List<Integer>> allAns , List<Integer> ans , int i , int[] nums){
        int n = nums.length;
        if(i == n){
            allAns.add(new ArrayList<>(ans));
            return;
        }
        //include step 
        ans.add(nums[i]);
        getAllSubsets(allAns , ans , i+1 , nums);

        //remove the element
        ans.remove(ans.size() - 1);
        int idx = i + 1;
        while( idx < n && nums[idx] == nums[idx-1] )idx++;
        getAllSubsets(allAns , ans , idx , nums);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> allAns = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        getAllSubsets(allAns , ans , 0 , nums);
        return allAns;
    }
}