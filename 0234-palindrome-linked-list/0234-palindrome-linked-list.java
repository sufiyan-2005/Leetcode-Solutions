class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();

        // Now push all the element of the linked list inside the stack
        ListNode curr = head;
        while(curr != null){
            int val;
            st.push(curr.val);
            curr = curr.next;
        }

        //we will check if the curr node of linked list is same as top of the stack or not
        curr = head;
        while(st.size()>0){

            //linked list is not palindrome 
            if(curr.val != st.peek()){
                return false;
            }else{
                st.pop();
                curr = curr.next;
            }
        }
        //linked list is a palindrome 
        return true;
    }
}