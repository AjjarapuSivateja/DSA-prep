public class LinkedListCycle2 {
    //Floyd cycle
    //Leetcode 142
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;

            }

        }
        if(fast==null || fast.next==null){
            return null;
        }
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
