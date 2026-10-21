class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
           // Math.abs() — Number ka positive value deta hai. Jaise Math.abs(-3) = 3
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                ans.add(Math.abs(nums[i]));
            }else{
                nums[index] = -nums[index];
            }
        }
        return ans;
    }
}