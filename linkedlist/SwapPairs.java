public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        //create a dummy Node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode point = dummy;


        while (point.next != null && point.next.next != null) {
            ListNode swap1 = point.next;
            ListNode swap2 = point.next.next;

            //swap the two nodes

            swap1.next = swap2.next;
            swap2.next = swap1;

            //Link point to second swap and prepare for next iteration

            point.next = swap2;
            point = swap1;
        }
        return dummy.next;

    }
}
