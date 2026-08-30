class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        while(ans.size() < n){
            List<Integer> temp = new ArrayList<>();

            for(int num : ans){
                if(2 * num - 1 <= n){
                    temp.add(2 * num - 1);
                }
            }

            for(int num : ans){
                if(2 * num <= n){
                    temp.add(2 * num);
                }
            }
            ans = temp;
        }

        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;     
    }
}