package _09_dsa_danhsach.exercise.e2;

public class MyLinkedList<E>implements Cloneable{
    private Node<E>head;
    private int numNodes;

    public MyLinkedList() {
        head= null;
    }
    public void addFirst(E e)
    {
        Node<E>newNode = new Node<>(e);// tao ra mot node moi
        newNode.next = head;//link the new node with the head
        head = newNode;// head points to the new node
        numNodes++; //Increase list node
    }
    public void addLast(E e)
    {
        Node<E>newNode = new Node<>(e);// tao ra mot node moi
        Node<E> current = head;
        if(head==null)
        {
            this.addFirst(e);
        }else {
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next =newNode;
        }
        numNodes++;

    }
    public void add(int index, E e)
    {
        if(index<0||index>numNodes)
        {
            throw new IndexOutOfBoundsException("Index"+index+"Out Of Bounds Exception");
        }
        if (index==0)
        {
            this.addFirst(e);
        }else if(index==numNodes)
        {
            addLast(e);
        }else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
                Node<E> temp = current.next;
                current.next = new Node<>(e);
                (current.next).next = temp;
                numNodes++;
            }
        }
    }
    public int size()
    {
        return numNodes;
    }
    public boolean remove(E e)
    {
        if(contains(e))
        {
            return true;
        }
        return false;
    }
    public E removeFirst()
    {
        E curent =  head.data;
        if(curent !=null)
        {
            head=head.next;
        }else
        {
            head= null;
        }
        numNodes--;
        return curent;
    }
    public E remove(int index)
    {
        if(index == 0) return removeFirst();
        else
        {
            Node<E>previous= head;
            for (int i = 0; i < index; i++) {
               previous = previous.next;
            }
            Node<E>current = previous.next;
            previous.next = current.next;
            numNodes--;
            return current.data;
        }


    }


    public boolean contains(E e)
    {
        Node current = head;
        if(current!=null)
        {
            for (int i = 0; i < numNodes; i++) {
                if(current.data.equals(e))
                {
                    return  true;
                }
                current = current.next;
            }
        }
        return false;
    }
    int indexOf(E e) {
        Node current = head;

        if (current != null) {
            for (int i = 0; i < numNodes; i++) {
                if (current.data.equals(e)) {
                    return i;
                }

                current = current.next;
            }
        }

        return -1;
    }

    public E get(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index "+index + "Out Of Bounds Exception ");
        }

        Node<E> current = head;
        if (current.next == null) {
            return getFirst();
        }

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

   public E getFirst() {
        return head != null ? head.data : null;
    }

   public E getLast() {
        Node<E> current = head;

        if (current.next == null) {
            return getFirst();
        }

        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

     class Node<E> {
        private Node<E> next;
        E data;

        public Node(E data) {
            this.data = data;
            next = null;
        }

        public E getData() {
            return data;
        }
    }
    public void clear()
    {
        head = null;
        numNodes =0;
    }
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }




}
