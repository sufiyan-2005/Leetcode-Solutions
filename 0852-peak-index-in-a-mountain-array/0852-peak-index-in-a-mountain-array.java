class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //brute force approach
        int index = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[index] < arr[i]){
                index = i;
            }
        }
        return index;
    }
}