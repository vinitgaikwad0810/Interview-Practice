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


    public static void printInOrder(BinaryTreeNode root) {

        if (root != null) {
            printInOrder(root.getLeft());
            GeneralUtils.println("--" + root.getData() + "--");
            printInOrder(root.getRight());
        }
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = BinaryTree.build();
        binaryTree.printInOrder(binaryTree.getRoot());

    }
}

