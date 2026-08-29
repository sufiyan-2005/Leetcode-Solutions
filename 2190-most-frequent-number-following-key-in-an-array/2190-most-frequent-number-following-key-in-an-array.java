class Solution {
    public int mostFrequent(int[] nums, int key) {
        int n = nums.length;
        int[] count = new int[1001];

        for(int i=0; i<n-1; i++){
            if(key == nums[i]){
                count[nums[i + 1]]++;
            }
        }
        int ans = 0;

        for(int i=0; i<count.length; i++){
            if(count[i] > count[ans]){
                ans = i;
            }
        }
        return ans;
    }
}