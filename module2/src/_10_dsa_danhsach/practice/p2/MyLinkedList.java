package _10_dsa_danhsach.practice.p2;

import _10_dsa_danhsach.practice.p1.MyAbstractList;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E>{
   Node<E> head = null;
   Node<E> tail = null;
   private int size=0;
   public MyLinkedList()
   {

   }
    public MyLinkedList(E[] elements)
    {
    }
    public void addFirst(E e)
    {
        Node newNode = new Node<E>(e);//create a new node
        newNode.next = head; // link the new node with the head
        head = head.next;//head points to the new node
        size++;
        if(tail==null)// the new node is the only node in list
        {
            tail=head;
        }
    }
    public void addLast(E e)
    {
        Node newNode = new Node<>(e);//create a new node for e
        if(tail ==null)
        {
            head = tail =newNode;//the only node in list
        }else
        {
            tail.next = newNode;//link the new node with the last node
            tail=tail.next;//tail now points to the last node
        }
        size++;//increase size
    }
    @Override
    public void add(int index, E e) {
       if(index==0) addFirst(e);
       else if(index>=size) addLast(e);
       else {
           Node <E>current = head;
           for (int i = 1; i < index; i++) {
               current = current.next;
               Node temp = current.next;
               current.next = new Node(e);
               (current.next).next = temp;
               size++;

           }
       }
    }
    public E removeFirst()
    {
        if(size==0) return null;//nothing to delete
        else {
            Node temp = head;//keep the first node temporarily
            head = head.next;//move head to point to next node
            size--;//reduce size by 1
            if(head==null) tail=null;//list becomes empty
            return (E) temp.element;//return the deleted element
        }
    }
    public E removeLast() {
        if (size == 0) return null; // Nothing to remove
        else if (size == 1) { // Only one element in the list
            Node temp = head;
            head = tail = null; // list becomes empty
            size = 0;
            return (E) temp.element;
        } else {
            Node current = head;

            for (int i = 0; i < size - 2; i++)
                current = current.next;

            Node temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return (E) temp.element;
        }
    }
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) return null; // Out of range
        else if (index == 0) return removeFirst(); // Remove first
        else if (index == size - 1) return removeLast(); // Remove last
        else {
            Node previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            size--;
            return (E) current.element;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
       size=0;
       head=null;
       tail=null;
    }
    public E getFirst()
    {
        return head!=null? head.element : null;
    }
    public E getLast()
    {
        Node temp = head;
        if (temp.next == null) {
            return getFirst();
        }
        while (temp.next!=null)
        {
            temp =temp.next;
        }
        return (E) temp.element;
    }

    @Override
    public E get(int index) {
        if(index<0||index>=size)
        {
            throw new IndexOutOfBoundsException("index"+index+"IndexOutOfBoundsException");
        }
        Node temp = head;
        if(temp.next==null)
        {
            getFirst();
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.element;
    }


    @Override
    public int indexOf(E e) {
        Node tmp = head;

        if (tmp != null) {
            for (int i = 0; i < size; i++) {
                if (tmp.element.equals(e)) {
                    return i;
                }

                tmp = tmp.next;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }
    public boolean contains(E e)
    {
        Node tmp = head;

        if (tmp != null) {
            do {
                if (tmp.element.equals(e)) {
                    return true;
                }

                tmp = tmp.next;
            } while (tmp != null);
        }

        return false;
    }



    @Override
    public Object set(int index, E e) {
        return null;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
