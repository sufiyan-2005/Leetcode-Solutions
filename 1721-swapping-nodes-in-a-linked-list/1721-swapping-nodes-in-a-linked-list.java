class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        //finding size of LL
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        //copy element from LL to array
        int[] arr = new int[size];
        temp = head;
        int i = 0;
        while(temp != null){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }

        // finding the position of kth node from beginning
        int left = k - 1;
        // finding the position of kth node from the end
        int right = size - k;

        //Now swap
        int Ntemp = arr[left];
        arr[left] = arr[right];
        arr[right] = Ntemp;

        //convert arr to LinkedList
        ListNode newHead = new ListNode(arr[0]);
        ListNode curr = newHead;
        for(int j = 1; j<size; j++){
            curr.next = new ListNode(arr[j]);
            curr = curr.next;
        }
        return newHead;
    }
}