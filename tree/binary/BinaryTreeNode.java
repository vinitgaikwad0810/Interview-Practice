package tree.binary;

/**
 * Created by vinit on 8/26/16.
 */
public class BinaryTreeNode {

    private char data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode(char data) {

        this.data = data;
    }
}
