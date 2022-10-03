// Binary Tree in Java
public class App {

    public static void main(String[] args) {

        // Think of your own imaginary club/company with at least 7 nodes

        // Put your name at the root of the tree
        Node A = new Node("Brandon");
        Node B = new Node("Rick");
        Node C = new Node("Glenn");
        Node D = new Node("Daryl");
        Node E = new Node("Carl");
        Node F = new Node("Michonne");
        Node G = new Node("Carol");

        // Create the edges between the nodes
        A.left = B;
        A.right = C;

        B.left = D;
        B.right = E;

        C.left = F;
        C.right = G;

        System.out.println("\nIn order Traversal: ");
        traverseInOrder(A);

        System.out.println("\nPre order Traversal: ");
        traversePreOrder(A);

        System.out.println("\nPost order Traversal");
        traversePostOrder(A);
    }

    // Perform pre-order traversal
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.println(" " + node.data);
            traversePreOrder(node.left);
            traversePostOrder(node.right);
        }
    }

    // Perform post-order traversal
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" " + node.data);
        }
    }

    // Perform in-order traversal
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.data);
            traverseInOrder(node.right);
        }
    }
}