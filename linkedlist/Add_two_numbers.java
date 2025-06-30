public class Add_two_numbers {
    Node head;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void printLL() {
        if (head == null) {
            System.out.println("The List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;

            }
        }

    }

    public void addFirst(int v) {
        Node n1 = new Node(v);
        n1.next = head;
        head = n1;
    }

    public void addlast(int v) {
        Node n1 = new Node(v);
        if (head == null) {
            head = n1;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;

    }

    public Node addTwoNumbers(Add_two_numbers l1, Add_two_numbers l2) {
        Node p1 = l1.head;
        Node p2 = l2.head;
        Node dummyhead = new Node(0);
        Node temp = dummyhead;
        int carry =0;
        while(p1!=null || p2!=null) {
            int val1 = (p1 != null) ? p1.value : 0;
            int val2 = (p2 != null) ? p2.value : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            temp.next = new Node(sum % 10);
            temp = temp.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
            if(carry>0){
                temp.next= new Node(carry);
            }

            return dummyhead.next;

        }
    public void printFromNode(Node node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }





    public static void main(String[] args) {
        Add_two_numbers l1 = new Add_two_numbers();
        l1.addlast(5);
        l1.addlast(6);
        l1.addlast(7);
        Add_two_numbers l2 = new Add_two_numbers();
        l2.addFirst(7);
        l2.addlast(6);
        l2.addlast(5);
        l2.addlast(4);
        l1.printLL();
        System.out.println();
        System.out.println("********");
        l2.printLL();
        System.out.println();
        Add_two_numbers result = new Add_two_numbers();
        Node sumHead = result.addTwoNumbers(l1, l2);

        System.out.println("Result:");
        result.printFromNode(sumHead);



    }
}

