public class PartitionList {
    //LeetCode - 86
    public ListNode partition(ListNode head, int x) {
        //maintain two dummy heads
        ListNode smaller =new ListNode(-1);
        ListNode higher = new ListNode(-1);
        ListNode smallerHead = smaller;
        ListNode higherHead = higher;

        while(head!=null){
            //compare values of original list and link to smalle ror higher lists
            if(head.val<x){
                smallerHead.next=head;
                smallerHead=smallerHead.next;
            }else{
                higherHead.next=head;
                higherHead=higherHead.next;
            }
            head=head.next;


        }
        //avoid cycle by cutting off the last node in the 'higher' list
        higherHead.next=null;
        //Link smaller and higher lists
        smallerHead.next=higher.next;
        return smaller.next;
    }
}
