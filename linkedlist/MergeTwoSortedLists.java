public class MergeTwoSortedLists {
    //LeetCode-21
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //create a dummy Node
        ListNode resultNode = new ListNode(-1);
        //store had of dummy Node
        ListNode headNode= resultNode;

        //Traverse till one of the list reaches end
        while(list1!=null && list2!=null){
            //Compare the two values of list and store smallest in dummyNode.next
            if(list1.val<=list2.val){
                resultNode.next=list1;
                list1=list1.next;
            }
            else{
                resultNode.next=list2;
                list2=list2.next;
            }
            resultNode = resultNode.next;
        }
        //if one list reaches end append the other list to our dummy list
        if(list1==null){
            resultNode.next=list2;
        }else if(list2==null){
            resultNode.next=list1;

        }
        //return the next of our dummy node
        return headNode.next;
    }
}
