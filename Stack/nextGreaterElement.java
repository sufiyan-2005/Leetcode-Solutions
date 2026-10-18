
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];
        int n = arr.length;
        
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{                      // arr[s.peek()]; se ele ka index mileaga
                                       //s.peek();  se ele milega
                nextGreater[i] = arr[s.peek()];
            }
            
            s.push(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();

               for (int i = 0; i < n; i++) {
                   ans.add(nextGreater[i]);
               }

               return ans;
        
    }
}
