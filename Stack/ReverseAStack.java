class Solution {
    public static void pushAtbottom(Stack<Integer> st , int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        
        int top = st.pop();
        pushAtbottom(st , data);
        st.push(top);
    }
    
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        
        int top = st.pop();
        reverseStack(st);
        pushAtbottom(st ,top);
    }
}
