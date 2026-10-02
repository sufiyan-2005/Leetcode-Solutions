class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = grid.length;
        int total = n * n;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int num = grid[i][j];
                map.getOrDefault(num , 0);
                map.put(num , map.getOrDefault(num , 0) + 1);
            }
        }
        int repeated = 0;
        int missing = 0;
        for(int i=1; i<=total; i++){
            if(!map.containsKey(i)){
                missing = i;
            }else if (map.get(i) == 2){
                repeated = i;
            }
        }
        return new int[] {repeated , missing};
    }
}