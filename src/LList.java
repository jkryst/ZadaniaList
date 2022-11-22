public class LList {
    Node head;
    class Node {
        int value;
        public Node next;

        Node(int v) {
            value = v;
        }

        @Override
        public String toString() {
            return "" + value;
        }
    }

    public LList(Node head){
        this.head=head;
    }

    public LList(){
    }

    public LList add(int value) {

        Node new_node = new Node(value);

        if(head==null){
            head = new_node;
        } else {

            Node last = head;
            while(last.next!=null) {
                last=last.next;
            }
            last.next = new_node;

        }
        return this;
    }

    @Override
    public String toString() {
        String result = "";
        Node element = head;

        while(element!=null) {
            result=result+" "+element.value;
            element=element. next;
        }

        return result;
    }
}
