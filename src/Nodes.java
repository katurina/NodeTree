/**
 * Created by Bird on 14.02.2017.
 */
public class Nodes {
    public static void main(String[] args) {
        Node n = new Node(3, null);
        n = new Node(2, n);
        n = new Node(1, n);
        n = new Node(0, n);


//        SingleLLUtils_2.add(n,4);
        SingleLLUtils_2.printNode(n);

    }
}
