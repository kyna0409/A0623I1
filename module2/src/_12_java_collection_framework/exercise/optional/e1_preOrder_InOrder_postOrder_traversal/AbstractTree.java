package _12_java_collection_framework.exercise.optional.e1_preOrder_InOrder_postOrder_traversal;

public abstract class AbstractTree<E> implements Tree<E> {
    @Override
    public boolean insert(E e) {
        return false;
    }
// /** Inorder traversal from the root*/


    @Override
    public void inOrder() {

    }

    @Override
    public void preOrder() {

    }

    @Override
    public void search(E e) {

    }

    @Override
    public boolean hasPathSum(TreeNode<E> root, int targetSum) {
        return false;
    }

    @Override
    public void postOrder() {

    }

    @Override
    public void delete(E e) {

    }

    @Override
    public int maxDepth(TreeNode<E> root) {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
