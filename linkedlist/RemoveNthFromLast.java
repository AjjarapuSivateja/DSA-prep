public class RemoveNthFromLast {
    //LeetCode-19
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode firstPtr =dummy;
        ListNode secondPtr = dummy;
        //move second pointer n spaces ahead
        for(int i=0;i<n;i++){
            secondPtr =secondPtr.next;
        }
        //move both pointers, until next of secondpointer is null

        while(secondPtr.next!=null){
            firstPtr = firstPtr.next;
            secondPtr =secondPtr.next;
        }

        //remove node
        firstPtr.next = firstPtr.next.next;

        return dummy.next;
    }
}
