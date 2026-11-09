class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size) return -1;

        Node temp = head;

        for(int i = 1; i <= index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {
        Node temp = new Node(val);

        if(head == null) {
            head = tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }

        size++;
    }

    public void addAtTail(int val) {
        if(tail == null) {
            addAtHead(val);
            return;
        }

        Node temp = new Node(val);

        tail.next = temp;
        tail = temp;

        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0) {
            addAtHead(val);
            return;
        }

        if(index > size) return;

        if(index == 0) {
            addAtHead(val);
            return;
        }

        if(index == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;

        for(int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }

        Node t = new Node(val);

        t.next = temp.next;
        temp.next = t;

        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;

        if(index == 0) {
            head = head.next;
            size--;

            if(head == null) tail = null;

            return;
        }

        Node temp = head;

        for(int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if(index == size - 1) {
            tail = temp;
        }

        size--;
    }
}