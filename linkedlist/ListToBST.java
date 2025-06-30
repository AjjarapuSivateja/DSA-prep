public class ListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){return null;}
        if(head.next==null){ return new TreeNode(head.val);}

        ListNode prev = null;
        ListNode slow=head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(prev!=null){
            prev.next=null;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow.next);
        return root;
    }
}


