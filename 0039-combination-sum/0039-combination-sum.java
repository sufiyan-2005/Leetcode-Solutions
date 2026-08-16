class Solution {
    public void getAllcombineSum(int[] candidates, int i ,List<Integer> ans, List<List<Integer>> allAns, int target){
        if(target == 0){
            allAns.add(new ArrayList<>(ans));
            return;
        }

        if(i == candidates.length || target < 0){
            return;
        }

        ans.add(candidates[i]);
        //Multiple choice
        getAllcombineSum(candidates , i , ans , allAns ,target - candidates[i]);
        ans.remove(ans.size() - 1);
        //exclusion
        getAllcombineSum(candidates , i+1 , ans , allAns ,target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allAns = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        getAllcombineSum(candidates , 0 , ans , allAns , target);
        return allAns; 
    }
}