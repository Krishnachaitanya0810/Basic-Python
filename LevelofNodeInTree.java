
import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {

    Node root;

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void findlevel(Node root, int level, int data) {
        if (root == null) {
            return;
        }
        if (root.data == data) {
            System.out.println("Level of " + data + " is " + level);
        }
        findlevel(root.left, level + 1, data);
        findlevel(root.right, level + 1, data);
    }

    public void printing(Node root) {
        if (root == null) {
            return;
        }
        printing(root.left);
        System.out.println(root.data);
        printing(root.right);
    }
}

class LevelofNodeInTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        BST tree = new BST();
        for (int i = 0; i < arr.length; i++) {
            tree.root = tree.insert(tree.root, arr[i]);
        }
        tree.findlevel(tree.root, 0, 4);
        tree.printing(tree.root);

    }
}
