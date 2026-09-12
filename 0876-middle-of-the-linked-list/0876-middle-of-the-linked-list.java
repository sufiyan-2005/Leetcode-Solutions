class Solution {
    public ListNode printll(ListNode slow){
        int val;
        ListNode temp = slow;
        while(temp != null){
            System.out.print(temp.val);
            temp = temp.next;
        }
        return temp;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}