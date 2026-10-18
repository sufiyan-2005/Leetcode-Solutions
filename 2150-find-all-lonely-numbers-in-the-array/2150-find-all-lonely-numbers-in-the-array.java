class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n; i++){
            if( (i == 0 || nums[i] - nums[i-1] > 1) && ( i == n-1 || nums[i+1] - nums[i]  > 1) ){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}