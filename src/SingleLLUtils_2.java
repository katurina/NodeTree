/**
 * Created by Bird on 14.02.2017.
 */
public class SingleLLUtils_2 {
    public static Node add(Node tail, int elem) {

        if (tail.next != null) {
            add(tail.next, elem);
        } else {
            tail.next = new Node(elem, null);
        }
        return tail;
    }

    public static void printNode(Node tail) {
        if (tail != null) {

            System.out.print(tail.value + " ");
            printNode(tail.next);

        }
    }

    public static Node remove(Node tail) {
        if (tail.next.next == null) {
            tail.next = null;
        } else {
            remove(tail.next);
        }
        return tail;
    }

    public static Node add(Node tail, int index, int elem) {
        if (index - 1 == 0) {
            Node n = new Node(elem, tail);
            return n;
        } else if (index - 1 == 1) {
            Node n = new Node(elem, tail.next);
            tail.next = n;

        } else {
            add(tail.next, --index, elem);
        }
        return tail;
    }

    public static Node remove(Node tail, int index) {
        if (index - 1 == 0) {
            tail = tail.next;
            return tail;
        } else if (index == 2) {
            tail.next = tail.next.next;

        } else {
            remove(tail.next, index - 1);
        }
        return tail;
    }
}
