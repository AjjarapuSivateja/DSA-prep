public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {

        if(head==null){ return null;}
        //1. insert new nodes in between existing nodes
        Node curr = head;
        while(curr!=null){
            Node newNode = new Node(curr.val);
            newNode.next=curr.next;
            curr.next=newNode;
            curr=newNode.next;

        }
        //2. copy random pointers
        curr= head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;

            }
            curr=curr.next.next;
        }
        //3. seperate two lists
        curr=head;
        Node newHead = head.next;
        Node newCurr=newHead;
        while(curr!=null){
            curr.next=newCurr.next;
            curr=curr.next;
            if(curr!=null){
                newCurr.next=curr.next;
                newCurr=newCurr.next;
            }
        }
        return newHead;

    }
}
