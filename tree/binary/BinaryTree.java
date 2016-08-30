package tree.binary;

import utils.GeneralUtils;

import java.util.LinkedList;
import java.util.Queue;
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

    public static void printInOrderNonRecursive(BinaryTreeNode root) {
        Stack<BinaryTreeNode> binaryTreeNodeStack = new Stack<>();
        BinaryTreeNode currentNode = root;
        // Boolean isDone = Boolean.FALSE;
        while (true) {


            if (currentNode != null) {
                binaryTreeNodeStack.push(currentNode);
                currentNode = currentNode.getLeft();
            } else {

                if (binaryTreeNodeStack.isEmpty())
                    break;
                else {

                    currentNode = binaryTreeNodeStack.pop();
                    GeneralUtils.print("--" + currentNode.getData() + "--");
                    currentNode = currentNode.getRight();
                }
            }

        }
    }

    public static void printPreOrderNonRecursive(BinaryTreeNode root) {
        Stack<BinaryTreeNode> binaryTreeNodeStack = new Stack<>();
        Boolean isDone = Boolean.FALSE;

        BinaryTreeNode currentNode = root;
        while (true) {


            if (currentNode != null) {
                GeneralUtils.print("--" + currentNode.getData() + "--");
                binaryTreeNodeStack.push(currentNode);
                currentNode = currentNode.getLeft();
            } else {
                if (binaryTreeNodeStack.isEmpty()) {
                    break;
                } else {

                    currentNode = binaryTreeNodeStack.pop();
                    currentNode = currentNode.getRight();
                }
            }

        }
    }

    //TODO InComplete
    public static void printPostOrderNonRecursive(BinaryTreeNode root) {
        Stack<BinaryTreeNode> binaryTreeNodeStack = new Stack<>();
        BinaryTreeNode currentNode = root, previousNode = root;
        Boolean alreadyVisited = Boolean.FALSE;
        binaryTreeNodeStack.push(root);
        while (true) {
            currentNode = binaryTreeNodeStack.peek();
            if (currentNode != null) {


                binaryTreeNodeStack.push(currentNode);
                currentNode = currentNode.getLeft();

            } else {
                if (binaryTreeNodeStack.isEmpty()) {
                    break;
                } else {

                    if (currentNode.getRight() != null && currentNode.getRight() != previousNode) {

                        binaryTreeNodeStack.push(currentNode.getRight());

                    } else {
                        previousNode = binaryTreeNodeStack.pop();
                        GeneralUtils.print("--" + currentNode.getData() + "--");

                    }

                }
            }

        }

    }

    public static void printLevelOrderTraversal(BinaryTreeNode root) {
        Queue<BinaryTreeNode> binaryTreeNodeQueue = new LinkedList<>();

        binaryTreeNodeQueue.add(root);

        while (!binaryTreeNodeQueue.isEmpty()) {

            BinaryTreeNode currentNode = binaryTreeNodeQueue.remove();
            GeneralUtils.print("--" + currentNode.getData() + "--");

            if (currentNode.getLeft() != null) {

                binaryTreeNodeQueue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                binaryTreeNodeQueue.add(currentNode.getRight());
            }
        }
    }

    public static Integer height(BinaryTreeNode root) {

        if (root != null) {
            Integer heightOfLeftSubtree = height(root.getLeft());
            Integer heightOfRightSubtree = height(root.getRight());

            if (heightOfLeftSubtree <= heightOfRightSubtree) {
                return heightOfRightSubtree + 1;
            } else {
                return heightOfLeftSubtree + 1;
            }
        } else {
            return 0;
        }

    }

    public static Integer heightNonRecursive(BinaryTreeNode root) {

        Queue<BinaryTreeNode> binaryTreeNodeQueue = new LinkedList<>();

        binaryTreeNodeQueue.offer(root);
        binaryTreeNodeQueue.offer(null);

//        while (!binaryTreeNodeQueue.isEmpty()) {
//
//            BinaryTreeNode current = binaryTreeNodeQueue.poll();
//
//            if(current.getRight())
//        }
        return null;
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = BinaryTree.build();
        GeneralUtils.println("Recursive InOrder Traversal");
        binaryTree.printInOrderRecursive(binaryTree.getRoot());
        GeneralUtils.println("\nRecursive PreOrder Traversal");
        binaryTree.printPreOrderRecursive(binaryTree.getRoot());
        GeneralUtils.println("\nRecursive PostOrder Traversal");
        binaryTree.printPostOrderRecursive(binaryTree.getRoot());

        GeneralUtils.println("\nNon Recursive InOrder Traversal");
        binaryTree.printInOrderNonRecursive(binaryTree.getRoot());

        GeneralUtils.println("\nNon Recursive PreOrder Traversal");
        binaryTree.printPreOrderNonRecursive(binaryTree.getRoot());

//        GeneralUtils.println("\nNon Recursive PostOrder Traversal");
//        binaryTree.printPostOrderNonRecursive(binaryTree.getRoot());

        GeneralUtils.println("\nNon Recursive Level Order Traversal");
        binaryTree.printLevelOrderTraversal(binaryTree.getRoot());

        GeneralUtils.println("\nHeight of the tree =" + binaryTree.height(binaryTree.getRoot()));

    }
}

