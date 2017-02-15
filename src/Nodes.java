/**
 * Created by Bird on 14.02.2017.
 */
public class Nodes {
    public static void main(String[] args) {
        Node n = new Node(3, null);
        n = new Node(2, n);
        n = new Node(1, n);
        n = new Node(0, n);

        n = SingleLLUtils_2.add(n, 1, 55);


        n = SingleLLUtils_2.add(n, 4);
        n = SingleLLUtils_2.add(n, 7);
        SingleLLUtils_2.printNode(n);

        n = SingleLLUtils_2.remove(n);
        System.out.println();

        SingleLLUtils_2.printNode(n);
        System.out.println();
        n = SingleLLUtils_2.remove(n, 2);

        SingleLLUtils_2.printNode(n);

    }
}
