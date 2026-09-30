class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
     ArrayList<Boolean> list = new ArrayList<>();

     int max = candies[0];
     for(int i=1; i<n; i++){
        if(candies[i] > max){
            max = candies[i];
        }
     }

     for(int i=0; i<n; i++){
        if(candies[i] + extraCandies >= max){
            list.add(true);
        }else{
            list.add(false);
        }
     }
     return list;   
    }
}