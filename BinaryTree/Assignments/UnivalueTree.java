package BinaryTree.Assignments;

import javax.swing.tree.TreeNode;

public class UnivalueTree {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static node binarytreeConstruction(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left = binarytreeConstruction(nodes);
            newnode.right = binarytreeConstruction(nodes);

            return newnode;

        }
    }

    public static void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static boolean isUnivalued(node root, int value) {
        if (root == null) {
            return true;
        }

        if (root.data != value) {
            return false;
        }

        boolean left = isUnivalued(root.left, value);
        boolean right = isUnivalued(root.right, value);

        return left && right;

    }

    public static node deleteLeveas(node root, int x) {
        if (root == null) {
            return null;
        }
        root.left = deleteLeveas(root.left, x);
        root.right = deleteLeveas(root.right, x);

        if (root.data == x && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }


    public static int maxvalues(node root){
        int max[]=new int[1];
        max[0]=Integer.MIN_VALUE;

        maxsumpath(root,max);
        return max[0];
    }


     public static int maxsumpath(node root,int max[]){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,maxsumpath(root.left, max));

        int right=Math.max(0,maxsumpath(root.right, max));

        max[0]=Math.max(max[0],left+right+root.data);

        return Math.max(left,right)+root.data;
        

    }
    public static void main(String[] args) {

        int nodes[] = { 1, 3, 3, -1, -1, 2, -1, -1, 3, -1, -1 };
        BinaryTree.idx = -1;

        node root = BinaryTree.binarytreeConstruction(nodes);

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        // Univalued check
        if (isUnivalued(root, root.data)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Delete leaves with value 3
        root = deleteLeveas(root, 3);

        System.out.print("After deleting leaves with value 3: ");
        preorder(root);
    }
}
