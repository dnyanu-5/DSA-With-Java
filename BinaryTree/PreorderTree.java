package BinaryTree;

import java.util.*;

public class PreorderTree {

    // -------------------- Node Class --------------------
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

    // -------------------- BinaryTree Class --------------------
    static class BinaryTree {
        static int idx = -1;

        // Build tree using preorder array
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

        // ---------------- Traversals ----------------
        public static void preorder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // ---------------- Height ----------------
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        // ---------------- Diameter O(n^2) ----------------
        public static int diameter2(Node root) {
            if (root == null) {
                return 0;
            }

            int ld = diameter2(root.left);
            int rd = diameter2(root.right);
            int lh = height(root.left);
            int rh = height(root.right);

            int selfDia = lh + rh + 1;
            return Math.max(Math.max(ld, rd), selfDia);
        }

        // ---------------- Count Nodes ----------------
        public static int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            return countNodes(root.left) + countNodes(root.right) + 1;
        }

        // ---------------- Sum of Nodes ----------------
        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
        }

        // ---------------- Level Order ----------------
        public static void levelOrder(Node root) {
            if (root == null)
                return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curr = q.remove();

                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null)
                        q.add(curr.left);
                    if (curr.right != null)
                        q.add(curr.right);
                }
            }
        }
    }

    // ---------------- Optimized Diameter (O(n)) ----------------
    static class Info {
        int dia;
        int hei;

        Info(int d, int h) {
            this.dia = d;
            this.hei = h;
        }
    }

    public static Info optimizedDiameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = optimizedDiameter(root.left);
        Info rightInfo = optimizedDiameter(root.right);

        int height = Math.max(leftInfo.hei, rightInfo.hei) + 1;

        int selfDiameter = leftInfo.hei + rightInfo.hei + 1;

        int maxDiameter = Math.max(selfDiameter, Math.max(leftInfo.dia, rightInfo.dia));

        return new Info(maxDiameter, height);
    }

    // -------------------- MAIN --------------------
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree bt = new BinaryTree();
        Node root = bt.BinaryTreePreorder(nodes);
        
        // bt.preorder(root);
        // System.out.println();
        // bt.inorder(root);
        // System.out.println();
        // bt.postorder(root);
        // System.out.println();

        // bt.levelOrder(root);

        // System.out.println("Height: " + bt.height(root));
        // System.out.println("Nodes: " + bt.countNodes(root));
        // System.out.println("Sum: " + bt.sumOfNodes(root));

        // System.out.println("Diameter (O(n^2)): " + bt.diameter2(root));

        Info result = optimizedDiameter(root);
        System.out.println("Diameter (Optimized): " + result.dia);
    }
}
