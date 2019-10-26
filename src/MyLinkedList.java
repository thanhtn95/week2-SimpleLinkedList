

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node tmp = head;
        Node holder;
        for (int i = 0; i < index - 1 && tmp.next != null; i++) {
            tmp = tmp.next;
        }
        holder = tmp.next;
        tmp.next = new Node(data);
        tmp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node tmp = head;
        head = new Node(data);
        head.next = tmp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
