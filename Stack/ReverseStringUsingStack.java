class Solution {
    public String reverse(String S) {
        Stack<Character> str = new Stack<>();
        int idx = 0;
        
        while(idx < S.length()){
            str.push(S.charAt(idx));
            idx++;
        }
        
        StringBuilder result = new StringBuilder("");
        while(!str.isEmpty()){
            char curr = str.pop();
            result.append(curr);
        }
        return result.toString();
    }
}
