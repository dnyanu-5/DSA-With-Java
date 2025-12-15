package BinaryTree;
import java.util.*;

public class Subtree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node BinaryTreePreorder(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = BinaryTreePreorder(nodes);
            newnode.right = BinaryTreePreorder(nodes);
            return newnode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static boolean isIdentical(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        } else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }
        if (!isIdentical(root.left, subroot.left)) {
            return false;
        }
        if (!isIdentical(root.right, subroot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubroot(Node root, Node subroot) {
        if (root == null) {
            return false;
        }

        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return isSubroot(root.left, subroot) || isSubroot(root.right, subroot);
    }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void TopView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);

                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void klevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        klevel(root.left, level + 1, k);
        klevel(root.right, level + 1, k);
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean left = getPath(root.left, n, path);
        boolean right = getPath(root.right, n, path);

        if (left || right) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca2(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);

        if (right == null) {
            return left;
        }
        if (left == null) {
            return right;
        }

        return root;
    }

    public static int lcaPath(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }
        int leftDist = lcaPath(root.left, n);
        int rightDist = lcaPath(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public static int minDistance(Node root, int n1, int n2) {

        Node lca = lca2(root, n1, n2);
        int dist1 = lcaPath(lca, n1);
        int dist2 = lcaPath(lca, n2);

        return dist1 + dist2;
    }

    public static int kthAncestor(Node root, int k, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int left = kthAncestor(root.left, k, n);
        int right = kthAncestor(root.right, k, n);

        if (left == -1 && right == -1) {
            return -1;
        }
        int max = Math.max(left, right);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static int transformSumTree(Node root) {
        if (root == null) {
            return 0;
        }
        int left = transformSumTree(root.left);
        int right = transformSumTree(root.right);
        int data = root.data;

        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;

        root.data = newleft + left + newright + right;
        return data;
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree bt = new BinaryTree();
        // BinaryTree.idx = -1;
        Node root = bt.BinaryTreePreorder(nodes);
        // bt.preorder(root);
        // System.out.println();

        // int subtree[] = { 2, 4, -1, -1, 5, -1, -1 };
        // BinaryTree.idx = -1;
        // Node subroot = bt.BinaryTreePreorder(subtree);
        // bt.preorder(subroot);
        // System.out.println();

        // System.out.println(isSubroot(root, subroot));

        // TopView(root);

        // int k = 3;
        // klevel(root, 1, k);

        int n1 = 4;
        int n2 = 6;
        // System.out.println(lca(root, n1, n2).data);

        // System.out.println(lca2(root, n1, n2).data);

        // System.out.println(minDistance(root, n1, n2));

        // int n = 5;
        // int kth = 2;
        // kthAncestor(root, kth, n);

        transformSumTree(root);
        preorder(root);

    }

}
