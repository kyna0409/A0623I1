package _12_java_collection_framework.exercise.optional.e1_preOrder_InOrder_postOrder_traversal;

public interface Tree<E>{
    //Insert element e into the binary search tree
    // return true if element is inserted successfully
    public boolean insert(E e);

    //post_order traversal from the root
    public void postOrder();
    //in_order traversal from the root
    public void inOrder();
    //pre_order traversal from the root
    public void preOrder();
    // get the number of nodes in the tree
    public  int getSize();
    public void delete(E e);
    public void search(E e);
    public int maxDepth(TreeNode<E> root);
    public boolean hasPathSum(TreeNode<E>root,int targetSum);
}
