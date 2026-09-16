class Solution {
    public void reorderList(ListNode head) {
        //step 1 -> find mid
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        
        //step 2 -> reverse second half
        ListNode curr = mid.next;
        mid.next = null;
        ListNode prev = null;
        // next;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step 3 -> alternate merging
        ListNode leftHead = head;
        ListNode rightHead = prev;
        ListNode nextLeft;
        ListNode nextRight;
        while(leftHead != null && rightHead != null){
            nextLeft = leftHead.next;
            leftHead.next = rightHead;

            nextRight = rightHead.next;
            rightHead.next = nextLeft;

            //update condition
            rightHead = nextRight;
            leftHead = nextLeft;
        }

    }
}