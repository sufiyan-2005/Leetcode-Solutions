class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean odd = false;
        boolean even = false;

        int min = nums1[0];

        for(int x:nums1){
            if(x % 2 == 0){
                even = true;
            }else{
                odd = true;
            }
            min = Math.min(min , x);
        }

        if(!even || !odd){
            return true;
        }

        return min % 2 != 0;
    }
}