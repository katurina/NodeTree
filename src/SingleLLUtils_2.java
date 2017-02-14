/**
 * Created by Bird on 14.02.2017.
 */
public class SingleLLUtils_2 {
    public static Node add(Node tail, int elem) {

        if (tail != null) {
            add(tail.next, elem);
        } else {
            tail = new Node(elem, null);
        }
        return tail;
    }

    public static void printNode(Node tail) {
        if (tail != null) {
            System.out.print(tail.value + ' ');
            printNode(tail.next);
        }
    }
//    public static Node remove(Node tail){}
//    public static Node add(Node tail,int index,int elem){}
//    public static Node remove(Node tail,int index){}
}
