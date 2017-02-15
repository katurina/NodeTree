/**
 * Created by Bird on 14.02.2017.
 */

public class BinaryTreeUtils {
    public static int left, right, result;
    public static int n;
    static int k = 0;

    public static void printTree(TreeNode root) {
        if (root.left != null) {
            printTree(root.left);
        }
        if (root.right != null) {
            printTree(root.right);
        }
        System.out.print(root.value + " ");

    }

    public static int size(TreeNode root) {
        if (root.right != null) {
            size(root.right);
        }
        if (root.left != null) {
            size(root.left);
        }
        k++;
        return k;
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.value + sum(root.left) + sum(root.right);
    }

    public static int max(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(root.value, Math.max(root.left.value, root.right.value));
    }
}
