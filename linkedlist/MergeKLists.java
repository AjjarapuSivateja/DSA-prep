public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        //min-heap based on node values
        //lambda expression to makeit a min heap of nodes

        PriorityQueue<ListNode> heap = new PriorityQueue<>(
                (a, b) -> a.val - b.val);


        //add heads of all nodes to heap

        for (ListNode node : lists) {
            if (node != null) {
                heap.add(node);
            }
        }

        //create a dummy node and save its head in temp

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (!heap.isEmpty()) {

            //remove the lowest element from min heap and add it to our dummy node
            ListNode min = heap.remove();
            temp.next = min;
            temp = temp.next;

            //since minimum is removed add the next node in heap from same list if it is not empty

            if (min.next != null) {
                heap.add(min.next);
            }
        }
        return dummy.next;

    }
}
