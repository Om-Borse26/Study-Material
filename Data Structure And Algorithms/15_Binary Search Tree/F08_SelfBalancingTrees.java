import java.util.LinkedList;
import java.util.Queue;

public class F08_SelfBalancingTrees {
    public static void main(String[] args) {
    }
}

class AVLTree {
    private static class Node {
        int data;
        Node left, right;
        int height;

        public Node(int key) {
            this.data = key;
            this.height = 1;
        }
    }

    private Node root;

    private Node insertAVL(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.data) {
            root.left = insertAVL(root.left, key);
        } else if (key > root.data) {
            root.right = insertAVL(root.right, key);
        } else {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        // LL Case
        if (balance > 1 && key < root.left.data) {
            return rotateRight(root);
        }
        // RR Case
        if (balance < -1 && key > root.right.data) {
            return rotateLeft(root);
        }
        // LR Case
        if (balance > 1 && key > root.left.data) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        // RL Case
        if (balance < -1 && key < root.right.data) {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }

        return root;
    }

    private int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private Node rotateLeft(Node y) {
        Node x = y.right;
        Node T = x.left;

        x.left = y;
        y.right = T;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    private Node rotateRight(Node x) {
        Node y = x.left;
        Node T = y.right;

        y.right = x;
        x.left = T;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    public void insert(int key) {
        root = insertAVL(root, key);
    }

    public boolean search(int key) {
        return search(root, key);
    }

    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data < key) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public void delete(int key) {
        root = deleteAVL(root, key);
    }

    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private Node deleteAVL(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data) {
            root.left = deleteAVL(root.left, key);
        } else if (key > root.data) {
            root.right = deleteAVL(root.right, key);
        } else {
            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                Node successor = minValueNode(root.right);
                root.data = successor.data;
                root.right = deleteAVL(root.right, successor.data);
            }
        }

        if (root == null)
            return null;

        // Update height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Check balance factor
        int balance = getBalance(root);

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rotateRight(root);
        }
        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0) {
            return rotateLeft(root);
        }
        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }

        return root;
    }

    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current != null) {
                System.out.print(current.data + " ");
                queue.add(current.left);
                queue.add(current.right);
            }
        }
    }
}

class RedBlackTree {
    private static class Node {
        int data;
        Node left, right;
        boolean color;

        public Node(int key) {
            this.data = key;
            this.color = RED;
        }
    }

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private Node root;

    private Node insertRBT(Node root, int key) {
        root = insertRBTRec(root, key); // Use recursive helper method for insertion
        root.color = BLACK; // Root must always be black
        return root;
    }

    private Node insertRBTRec(Node root, int key) {
        // Perform regular BST insertion
        if (root == null)
            return new Node(key);

        if (key < root.data) {
            root.left = insertRBTRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRBTRec(root.right, key);
        } else {
            return root; // Duplicate keys not allowed
        }

        // Perform color adjustments and rotations to maintain Red-Black Tree properties
        if (isRed(root.right) && !isRed(root.left))
            root = rotateLeft(root);
        if (isRed(root.left) && isRed(root.left.left))
            root = rotateRight(root);
        if (isRed(root.left) && isRed(root.right))
            flipColors(root);

        return root;
    }

    private boolean isRed(Node node) {
        return node != null && node.color == RED;
    }

    private void flipColors(Node node) {
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
    }

    private Node rotateLeft(Node y) {
        Node x = y.right;
        Node T = x.left;

        x.left = y;
        y.right = T;

        return x;
    }

    private Node rotateRight(Node x) {
        Node y = x.left;
        Node T = y.right;

        y.right = x;
        x.left = T;

        return y;
    }

    public void insert(int key) {
        root = insertRBT(root, key);
    }

    public boolean search(int key) {
        return search(root, key);
    }

    private boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data < key) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current != null) {
                System.out.print(current.data + " ");
                queue.add(current.left);
                queue.add(current.right);
            }
        }
    }
}