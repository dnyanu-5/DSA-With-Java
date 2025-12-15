package Bst;

import java.util.*;

public class BinarySearchTree {
    static class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static node insert(node root, int val) {
        if (root == null) {
            return root = new node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean SearchInBst(node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return SearchInBst(root.left, key);
        } else {
            return SearchInBst(root.right, key);
        }
    }

    public static node DeleteNode(node root, int val) {
        // search
        if (root.data > val) {
            root.left = DeleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = DeleteNode(root.right, val);
        } else {
            // case 1 leafe node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 :1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 two childres
            node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = DeleteNode(root.right, Is.data);
        }
        return root;
    }

    public static node findInorderSuccessor(node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void PrintInRange(node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right, k1, k2);
        }
        if (root.data < k1) {
            PrintInRange(root.right, k1, k2);
        } else if (root.data > k2) {
            PrintInRange(root.left, k1, k2);
        }
    }

    public static void printPathLeaf2Node(node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + "->");
            }
            System.out.println("null");
        }

        printPathLeaf2Node(root.left, path);
        printPathLeaf2Node(root.right, path);
        path.remove(path.size() - 1);

    }

    public static boolean isValid(node root, node min, node max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }

    public static node mirrorBst(node root) {
        if (root == null) {
            return null;
        }
        node leftmirror = mirrorBst(root.left);
        node rightmirror = mirrorBst(root.right);
        root.left = rightmirror;
        root.right = leftmirror;

        return root;
    }

    public static void main(String[] args) {
        System.out.println("Binary Search Tree");
        int values[] = { 8, 5, 3,6,10,11};
        node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        // boolean Search=SearchInBst(root,1);

        // if(Search){
        // System.out.println("key found");
        // }else{
        // System.out.println("key not found");
        // }

        // root = DeleteNode(root, 11);
        // inorer(root);

        // PrintInRange(root, 5, 12);

        // printPathLeaf2Node(root, new ArrayList<>());

        // if (isValid(root, null, null)) {
        //     System.out.println("valid");
        // } else {
        //     System.out.println("invalid");
        // }
        mirrorBst(root);
        inorder(root);
        System.out.println();
    }

}
