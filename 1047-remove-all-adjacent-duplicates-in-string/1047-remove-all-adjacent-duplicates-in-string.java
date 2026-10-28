class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            //if the stack has element  ans top  is same as ch then pop
            if(st.size()>0 && st.peek() == ch){
                st.pop();
            }else{
                //if the stack is empty
                // or the ch is not same as the top
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();

        while(st.size()>0){
            ans.append( st.pop() );
        }

        return ans.reverse().toString();
    }
}