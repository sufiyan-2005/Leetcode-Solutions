class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){

            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            if(i + 1 < nums.length && nums[i] == nums[i + 1]){
                continue;
            }

            if(i > 0 && nums[i] - nums[i - 1] == 1){
                continue;
            }

            if(i + 1 < nums.length &&  nums[i + 1] - nums[i] == 1){
                continue;
            }
            ans.add(nums[i]);
        }
        return ans;
    }
}