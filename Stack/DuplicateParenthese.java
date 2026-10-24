class Solution {
    public boolean checkRedundancy(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            
            //closing condition
            if(ch == ')'){
                int count = 0;
                while(st.peek() != '('){
                st.pop();
                count++;
            }
            if(count < 2){
                return true;
            }else{
                st.pop();
             }
            }else{ //opening condition
                st.push(ch);
            }
        }
        return false;
    }
}
