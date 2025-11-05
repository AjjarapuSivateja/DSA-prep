public class ReverseLinkedList2 {
    //LeetCode:92
    public ListNode reverseBetween(ListNode head, int left, int right) {

        //create a dummy Node to mark the head of this list
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        //make markers for current node and for the node before reversing

        ListNode leftPre = dummy;
        ListNode currentNode = head;


        for(int i=0;i<left-1;i++){
            leftPre = leftPre.next;
            currentNode= currentNode.next;

        }

        //make a marker for the node where we start reversing

        ListNode subListHead = currentNode;

        //usual reverse code
        ListNode preNode = null;
        for(int i=0;i<=right-left;i++){
            ListNode nextNode  =  currentNode.next;
            currentNode.next=preNode;
            preNode=currentNode;
            currentNode=nextNode;

        }

        // link the pieces
        leftPre.next=preNode;
        subListHead.next=currentNode;



        return dummy.next;








    }
}
