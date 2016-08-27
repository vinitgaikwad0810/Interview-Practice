package tree.binary;

import utils.GeneralUtils;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by vinit on 8/26/16.
 */
public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public static BinaryTree build() {


        Stack<BinaryTreeNode> builderStack = new Stack<>();

        Boolean isTreeBuildingDone = Boolean.FALSE;

        GeneralUtils.println("Enter the data of root ?");
        Scanner userInput = new Scanner(System.in);
        BinaryTreeNode root = new BinaryTreeNode(userInput.next().charAt(0));

        builderStack.push(root);

        while (!builderStack.isEmpty()) {
            BinaryTreeNode binaryTreeNode = builderStack.pop();
            GeneralUtils.println("Do you want to enter the left node of " + binaryTreeNode.getData());

            Character ans = userInput.next().charAt(0);
            if (ans == 'Y') {
                GeneralUtils.println("Please enter the data");
                BinaryTreeNode left = new BinaryTreeNode(userInput.next().charAt(0));
                binaryTreeNode.setLeft(left);
                builderStack.push(left);
            }

            GeneralUtils.println("Do you want to enter the right node of " + binaryTreeNode.getData());

            ans = userInput.next().charAt(0);
            if (ans == 'Y') {
                GeneralUtils.println("Please enter the data");
                BinaryTreeNode right = new BinaryTreeNode(userInput.next().charAt(0));
                binaryTreeNode.setRight(right);
                builderStack.push(right);
            }
        }

        return new BinaryTree(root);
    }


    public static void printInOrderRecursive(BinaryTreeNode root) {


        if (root != null) {
            printInOrderRecursive(root.getLeft());
            GeneralUtils.print("--" + root.getData() + "--");

            printInOrderRecursive(root.getRight());
        }
    }

    public static void printPreOrderRecursive(BinaryTreeNode root) {


        if (root != null) {
            GeneralUtils.print("--" + root.getData() + "--");
            printPreOrderRecursive(root.getLeft());
            printPreOrderRecursive(root.getRight());
        }
    }

    public static void printPostOrderRecursive(BinaryTreeNode root) {


        if (root != null) {
            printPostOrderRecursive(root.getLeft());
            printPostOrderRecursive(root.getRight());
            GeneralUtils.print("--" + root.getData() + "--");
        }
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = BinaryTree.build();
        GeneralUtils.println("Recursive InOrder Traversal");
        binaryTree.printInOrderRecursive(binaryTree.getRoot());
        GeneralUtils.println("Recursive PreOrder Traversal");
        binaryTree.printPreOrderRecursive(binaryTree.getRoot());
        GeneralUtils.println("Recursive PostOrder Traversal");
        binaryTree.printPostOrderRecursive(binaryTree.getRoot());

    }
}

