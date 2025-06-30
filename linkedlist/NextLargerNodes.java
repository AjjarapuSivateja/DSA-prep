public class NextLargerNodes {
    //LeetCode 1019
    public int[] nextLargerNodes(ListNode head) {

        List<Integer> values = new ArrayList<>();
        for(ListNode node = head; node!=null;node=node.next){
            values.add(node.val);
        }
        int[] result=new int[values.size()];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<values.size();i++){
            while(!st.isEmpty() && values.get(i)> values.get(st.peek())){
                int index = st.pop();
                result[index]=values.get(i);

            }
            st.push(i);
        }
        return result;



    }
}
