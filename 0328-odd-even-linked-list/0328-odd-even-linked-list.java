class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        ListNode curr = head;
        int index = 1;

        ListNode oddHead = new ListNode(-1);
        ListNode oddTail = oddHead;

        ListNode evenHead = new ListNode(-1);
        ListNode evenTail = evenHead;

        while(curr != null){

            if(index % 2 == 1){
                oddTail.next = curr;
                oddTail = curr;   
            }else{
                evenTail.next = curr;
                evenTail = curr;
            }
            curr = curr.next;
            index++;
        }
        oddTail.next = null;
        evenTail.next = null;

        oddTail.next = evenHead.next;

        return oddHead.next;
    }
}