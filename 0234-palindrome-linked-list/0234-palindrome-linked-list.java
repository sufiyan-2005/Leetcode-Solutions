class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        //push all the element of linkedList inside the stack

        ListNode curr = head;
        while(curr != null){
            st.push(curr.val);
            curr = curr.next;
        }

        // we will check the curr node val and top  of the stack val is same or not
        curr = head;

        while( st.size() > 0){
            if(curr.val != st.peek()){
                //linkedlist is palindrome
                return false;
            }else{
                st.pop();
                curr = curr.next;
            }
        }
        return true;
    }
}