package _12_java_collection_framework.exercise.optional.e1_preOrder_InOrder_postOrder_traversal;


public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {

    }

    public BST(E[] o) {
        for (int i = 0; i < o.length; i++) {
            insert(o[i]);
        }
    }

    ////c1 inserted by loop
//    @Override
//    public boolean insert(E e) {
//        ///c1
//        if (root == null)
//            root = createNewNode(e); /*create a new root*/
//        else {
//            /*locate the parent node*/
//            TreeNode<E> parent = null;
//            TreeNode<E> current = root;
//            while (current != null) {
//                if (e.compareTo(current.element) < 0) {
//                    parent = current;
//                    current = current.left;
//                } else if (e.compareTo(current.element) > 0) {
//                    parent = current;
//                    current = current.right;
//                } else
//                    return false; /*Duplicate node not inserted*/
//            }
//            if (e.compareTo(parent.element) < 0)
//                parent.left = createNewNode(e);
//            else
//                parent.right = createNewNode(e);
//        }
//        size++;
//        return true; /*element inserted successfully*/
//    }
    public void add(E e) {
        root = addLoop(root, e);
    }

    public TreeNode<E> addLoop(TreeNode<E> root, E e) {
        if (root == null) {
            return createNewNode(e);
        } else {
            TreeNode<E> current = root;
            while (true) {
                if (e.compareTo(current.element) < 0) {
                    if (current.left == null) {
                        current.left = createNewNode(e);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (e.compareTo(current.element) > 0) {
                    if (current.right == null) {
                        current.right = createNewNode(e);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    // Handle duplicate values (you can decide what to do here)
                    break;
                }
            }
        }
        size++;
        return root;
    }
    boolean contain(E t) {
        return containRecursive(root, t);
    }

    private boolean containRecursive(TreeNode<E> cur, E t) {
        if (cur == null) {
            return false;
        }

        if (t.compareTo(cur.element) == 0) {
            return true;
        }

        return t.compareTo(cur.element) > 0
                ? containRecursive(cur.right, t)
                : containRecursive(cur.left, t);
    }

    @Override
    public void search(E e) {
        if(searchRecursive(root,e)==null)
        {
            System.out.println("ko co");
        }else {
            System.out.println("co");
        }

    }



    public TreeNode<E> searchRecursive(TreeNode<E> root, E key)
    {
        if(root==null){
            return null;
        }
        if(key.compareTo(root.element)<0){
            return searchRecursive(root.left,key);
        }else if (key.compareTo(root.element)>0)
        {
            return searchRecursive(root.right,key);
        }else {
            return root;
        }
    }

    //c2 insert by recursive
//    void add(E e) {
//        root = addRecursive(root, e);
//    }
//
//    private TreeNode addRecursive(TreeNode<E> root, E e) {
//        if (root == null) {
//          return createNewNode(e);
//        }
//
//        if (e.compareTo(root.element) < 0) {
//            root.left = addRecursive(root.left,e);
//        } else {
//          root.right = addRecursive(root.right,e);
//        }
//
//        return root;
//    }
//
    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public void inOrder() {
        inOrder(root);
    }

    protected void inOrder(TreeNode<E> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.element + " ");
        inOrder(root.right);
    }

    @Override
    public void delete(E e) {
        root=deleteRecursise(root,e);
    }
    //xoa node key trong cay root
    // return: cay moi da duoc xoa node key
    public TreeNode<E> deleteRecursise(TreeNode<E> root,E key){
       if(root==null)
       {
           return null;
       }
       //b1 tim node can xoa
       if(key.compareTo(root.element)<0){
           root.left=deleteRecursise(root.left, key);
       } else if (key.compareTo(root.element)>0) {
           root.right=deleteRecursise(root.right,key);
       }else {
           //root.val=key=>xoa root|xac dinh dc node xoa
           //b2:xoa node rôt có value = key
           //th1: root la node la
           if(root.left==null&&root.right==null)
           {
               return null;
           }
           //th2: root chi co mot node con ben trai
           if(root.left!=null&&root.right==null)
           {
               return root.left;
           }
           //th2: root chi co mot node con ben phai
           if(root.right!=null&&root.left==null )
           {
               return root.right;
           }
           //th3: ton tai 2 con
           // node trai cung cua mot cay
           TreeNode<E> leftMostNode = findLeftModeNode(root.right);
           root.element= leftMostNode.element;
           root.right=deleteRecursise(root.right, leftMostNode.element);

       }
        return root;
    }
    //tim node con trai cung cua node
public TreeNode<E> findLeftModeNode(TreeNode<E> root)
{
    if(root==null)return null;
    TreeNode<E> leftMostNode = root;
    while (leftMostNode.left!=null){
        leftMostNode = leftMostNode.left;
    }
    return leftMostNode;
}
    @Override
    public void preOrder() {
        preOrder(root);
    }

    protected void preOrder(TreeNode<E> root) {
        if (root == null) return;
        else {
            System.out.println(root.element + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    @Override
    public void postOrder() {
        postOrder(root);
    }

    protected void postOrder(TreeNode<E> root) {
        if (root == null) return;
        else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.element + " ");
        }
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public int maxDepth(TreeNode<E> root) {
        //b1:dieu kien dung|bai toan co so
        if(root==null)
        {
            return  0;
        }
        //b2: recipe recursive
        int chieucaoLeft = maxDepth(root.left);
        int chieucaoRight = maxDepth(root.right);
        int result = Math.max(chieucaoLeft,chieucaoRight)+1;
        return result;
    }


}
