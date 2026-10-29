class Pair{
    char ch;
    int freq;

    Pair(char ch , int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            //if the stack has pair and its peek char is same as ch
            // increase th freq of peek()
            if(st.size()>0 && st.peek().ch == ch){
                st.peek().freq++;

                if(st.peek().freq == k){
                    st.pop();
                }
            }else{
                //if the stack is empty
                //or curr char is not same as top pair char

                //then push the new char with the freq as 1
                st.push( new Pair(ch , 1));
            }
        }
        StringBuilder ans = new StringBuilder();

        while(st.size()>0){
            char ch = st.peek().ch;
            int freq = st.peek().freq;

            st.pop();

            //add this char freq number of times in ans
            for(int i=1; i<=freq; i++){
                ans.append(ch);
            }
        }
        return ans.reverse().toString();
    }
}