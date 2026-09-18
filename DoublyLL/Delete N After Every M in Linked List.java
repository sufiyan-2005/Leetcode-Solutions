class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        Node curr = head;
        while(curr != null){
            for(int i=1; i<=m-1 && curr != null; i++){
                curr = curr.next;
            }
            if (curr == null) {
                break;
              }
            Node temp = curr.next;
            for(int i=1; i<=n && temp != null; i++){
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
    }
}
