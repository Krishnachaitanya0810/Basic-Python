
import java.util.Scanner;

public class TreeTraversals {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        public static Node createTree(int[] nodes, int[] index) {
            if (index[0] >= nodes.length || nodes[index[0]] == -1) {
                index[0]++; // Move to the next index
                return null;
            }

            Node newNode = new Node(nodes[index[0]]);
            index[0]++; // Move to the next index

            newNode.left = createTree(nodes, index);
            newNode.right = createTree(nodes, index);

            return newNode;
        }

        // Preorder Traversal
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Inorder Traversal
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // Postorder Traversal
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input size.");
            return;
        }

        int[] nodes = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }

        int[] index = {0}; // Using an array to pass index by reference
        Node root = BinaryTree.createTree(nodes, index);

        System.out.println("Preorder Traversal:");
        BinaryTree.preorder(root);
        System.out.println("\nInorder Traversal:");
        BinaryTree.inorder(root);
        System.out.println("\nPostorder Traversal:");
        BinaryTree.postorder(root);
    }
}
