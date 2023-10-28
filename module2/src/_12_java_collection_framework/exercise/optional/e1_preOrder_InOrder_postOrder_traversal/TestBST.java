package _12_java_collection_framework.exercise.optional.e1_preOrder_InOrder_postOrder_traversal;
public class TestBST {
    public static void main(String[] args) {
        //create a BST
        //create a BST
        BST<String> tree = new BST<>();
        tree.add("George");
        tree.add("Michael");
        tree.add("Tom");
        tree.add("Adam");
        tree.add("Jones");
        tree.add("Peter");
        tree.add("Daniel");
        tree.add("Pob");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        //tree.delete("Peter");
       // tree.preOrder();
        tree.search("Peter");
        System.out.println(tree.maxDepth(tree.root));
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}

