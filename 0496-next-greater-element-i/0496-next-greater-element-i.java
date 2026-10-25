class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums1.length; 
        int m = nums2.length;
        int[] ans = new int[n];

        for(int i=m-1; i>=0; i--){
            int number = nums2[i];
            
            while(!s.isEmpty() && s.peek() <= number){
                s.pop();
            }
            if(s.isEmpty()){
                map.put(number , -1);
            }else{
                map.put(number , s.peek());
            }

            s.push(number);
        }

        for(int i=0; i<n; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}