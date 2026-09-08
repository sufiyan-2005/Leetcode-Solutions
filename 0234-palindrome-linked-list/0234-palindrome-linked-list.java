class Solution {
    public ListNode findMid(ListNode head){
        //finding middle using slow-fast concept
        ListNode slow  = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        int val;
        if(head == null || head.next == null){
           return true;
        }
        //step-1 -> find mid
        ListNode mid = findMid(head);

        //step-2 -> reverse 2nd half
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;

        //step-3 -> check left and right
        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}