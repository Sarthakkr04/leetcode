class Skiplist {

    private static final int MAX_LEVEL = 16;

    class Node {
        int val;
        Node[] next;

        Node(int val, int level) {
            this.val = val;
            next = new Node[level + 1];
        }
    }

    Node head;

    public Skiplist() {
        head = new Node(-1, MAX_LEVEL);
    }

    private int randomLevel() {
        int level = 0;

        while (Math.random() < 0.5 && level < MAX_LEVEL) {
            level++;
        }

        return level;
    }

    public boolean search(int target) {

        Node temp = head;

        for (int i = MAX_LEVEL; i >= 0; i--) {

            while (temp.next[i] != null && temp.next[i].val < target) {
                temp = temp.next[i];
            }
        }

        temp = temp.next[0];

        return temp != null && temp.val == target;
    }

    public void add(int num) {

        Node[] update = new Node[MAX_LEVEL + 1];

        Node temp = head;

        for (int i = MAX_LEVEL; i >= 0; i--) {

            while (temp.next[i] != null && temp.next[i].val < num) {
                temp = temp.next[i];
            }

            update[i] = temp;
        }

        int level = randomLevel();

        Node newNode = new Node(num, level);

        for (int i = 0; i <= level; i++) {

            newNode.next[i] = update[i].next[i];

            update[i].next[i] = newNode;
        }
    }

    public boolean erase(int num) {

        Node[] update = new Node[MAX_LEVEL + 1];

        Node temp = head;

        for (int i = MAX_LEVEL; i >= 0; i--) {

            while (temp.next[i] != null && temp.next[i].val < num) {
                temp = temp.next[i];
            }

            update[i] = temp;
        }

        temp = temp.next[0];

        if (temp == null || temp.val != num) {
            return false;
        }

        for (int i = 0; i <= MAX_LEVEL; i++) {

            if (update[i].next[i] != temp) {
                break;
            }

            update[i].next[i] = temp.next[i];
        }

        return true;
    }
}