package Divide_Conquer.Bst;

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

    public static int rangeSumBST(node root, int low, int high) {
        if (root == null) {
            return 0;
        }

        if (root.data < low) {
            return rangeSumBST(root.right, low, high);
        } else if (root.data > high) {
            return rangeSumBST(root.left, low, high);
        }
        return root.data + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);

    }

    public static node binaryTree(int nums[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;

        node root = new node(nums[mid]);
        root.left = binaryTree(nums, start, mid - 1);
        root.right = binaryTree(nums, mid + 1, end);

        return root;
    }

    public static void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);

    }

    public static node createBst(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        node root = new node(inorder.get(mid));
        root.left = createBst(inorder, st, mid - 1);
        root.right = createBst(inorder, mid + 1, end);

        return root;

    }

    public static node balancedBST(node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        // inorder sequence of arr

        getInorder(root, inorder);

        // sorted arrays--> bst
        root = createBst(inorder, 0, inorder.size() - 1);

        return root;
    }

    public static class info {
        boolean isBst;
        int size;
        int min;
        int max;

        public info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxSize = 0;
    public static node largestBSTRoot = null;

    public static info largestBst(node root) {
        if (root == null) {
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info leftinfo = largestBst(root.left);
        info rightinfo = largestBst(root.right);

        int size = leftinfo.size + rightinfo.size + 1;
        int min = Math.min(root.data, Math.min(leftinfo.min, rightinfo.min));
        int max = Math.max(root.data, Math.max(leftinfo.max, rightinfo.max));

        if (root.data <= leftinfo.max || root.data >= rightinfo.min) {
            return new info(false, size, min, max);
        }

        if (leftinfo.isBst && rightinfo.isBst) {
            maxSize = Math.max(maxSize, size);
            largestBSTRoot = root;
            return new info(true, size, min, max);
        }
        return new info(false, size, min, max);
    }

    public static node mergeBst(node root1, node root2) {

        // inordr on 1 and 2 bst
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // merge
        ArrayList<Integer> finalarr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {

            if (arr1.get(i) <= arr2.get(j)) {
                finalarr.add(arr1.get(i));
                i++;
            } else {
                finalarr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            finalarr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            finalarr.add(arr2.get(j));
            j++;
        }
        // create bst
        return createBst(finalarr, 0, finalarr.size() - 1);

    }

    public static int minDifferance(node root,int k){
       
        int closetElement=root.data;

        while(root!=null){
            if(Math.abs(root.data-k) < Math.abs(closetElement-k)){
                closetElement=root.data;
            }
            if(k<root.data){
                root=root.left;
            }else if(k>root.data){
                root=root.right;
            }
            else{
                break;
            }
        }
        return closetElement;

    }

    public static int count=0;
    public static node kSmallestElement(node root,int k){
        if(root==null){
            return null;
        }
        node left=kSmallestElement(root.left, k);
        if(left !=null){
            return left;    
        }
        count++;
        if(count==k){
            return root;
        }
        return kSmallestElement(root.right, k);

    }

    public static void main(String[] args) {
        System.out.println("Binary Search Tree");
        // int values[] = { 50, 30, 5, 20, 60, 45, 70, 65, 80 };
        // node root1 = null;

        // for (int i = 0; i < values.length; i++) {
        // root1 = insert(root1, values[i]);
        // }
        // preorder(root1);
        // System.out.println();

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
        // System.out.println("valid");
        // } else {
        // System.out.println("invalid");
        // }
        // mirrorBst(root);
        // inorder(root);
        // System.out.println();

        // System.out.println(rangeSumBST(root, 5, 10));
        // int nums[] = { -10, -3, 0, 5, 9 };

        // node arrRoot = binaryTree(nums, 0, nums.length - 1);
        // preorder(arrRoot);

        // balancedBST(root);
        // preorder(root);

        // node root = new node(50);
        // root.left = new node(30);
        // root.left.left = new node(5);
        // root.left.right = new node(20);

        // root.right = new node(60);
        // root.right.left = new node(45);
        // root.right.right = new node(70);
        // root.right.right.left = new node(65);
        // root.right.right.right = new node(80);

        // info info = largestBst(root);
        // System.out.println("largets Bst is :" + maxSize);
        // System.out.println("largest bst node:"+ largestBSTRoot.data);
        // node largeNode=largestBSTRoot;
        // preorder(largeNode);

        // node root1 = new node(2);
        // root1.left = new node(1);
        // root1.right = new node(4);

        // node root2 = new node(9);
        // root2.left = new node(3);
        // root2.right = new node(12);

        // node mergeRoot = mergeBst(root1, root2);
        // preorder(mergeRoot);

        int nodes[] = { 8, 5, 3, 6, 11, 20 };
        node bst = null;

        for (int i = 0; i < nodes.length; i++) {
            bst = insert(bst, nodes[i]);
        }
        // preorder(bst);
        // System.out.println();
        // System.out.println(minDifferance(bst, 10));


        count=0;
        node small= kSmallestElement(bst, 3);
        if(small==null){
            System.out.println("no smallest element");
        }else{
            System.out.println("k smallest elemet is:"+small.data);
        }


    }

}
