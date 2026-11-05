class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // if curr ch is number then push into number stack
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');       //ch - '0':- Character digit ko integer mein convert karega
            }else if (ch == '['){
                st1.push(num);   // if ch is '[' then store the number 
                st2.push(sb.toString()); // store string in the StringBuilder and then empty

                num = 0;                   
                sb = new StringBuilder();  // Empty the stringBuilder

            }else if(ch == ']'){
                int count = st1.pop();     //number stack se element ka number count mein store hua 
                String prev = st2.pop();

                StringBuilder temp = new StringBuilder(prev);

                for(int j=0; j<count; j++){
                    temp.append(sb);
                }
                sb = temp;
            }else{
                sb.append(ch);
            } 
        }
        return sb.toString();
    }
}