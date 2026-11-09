
class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                st1.push(num);
                st2.push(sb.toString());

                num = 0;
                sb = new StringBuilder();
            }
            else if (ch == ']') {
                int count = st1.pop();
                String prev = st2.pop();

                StringBuilder temp = new StringBuilder(prev);

                for (int j = 0; j < count; j++) {
                    temp.append(sb);
                }

                sb = temp;
            }
            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
