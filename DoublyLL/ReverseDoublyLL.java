class Solution {
    public Node reverse(Node head) {
       Node prev = null;
       Node curr = head;
       Node next;

        while(curr != null){
                   next = curr.next;
                   curr.next = prev;
                   curr.prev = next;
                   prev = curr;
                   curr = next;
               }
               return prev;
    }
}
