package _10_dsa_danhsach.exercise.e1;

public class MyList <E> implements Cloneable{
    private int size =0;
    public static final int DEFAULT_CAPACITY=10;
    private E elements[] = (E[]) new Object[DEFAULT_CAPACITY];
//    elements = (E[]) new Object[DEFAULT_CAPACITY];

//    private E elements[] = new Object[]
    public MyList() {
    }

    public MyList(int capacity) {
      elements = (E[])new Object[capacity];
    }
    // Add a new element at the specified index
    public void add(int index,E element)
    {
       //move the elements to the
        ensureCapacity(size);

        for (int i = size-1; i>=index ; i--) {
            elements[i+1] = elements[i];
        }
        //insert new element to data[index]
        elements[index] = element;
        // increase size by 1
        size++;

    }
    // create a new larger array, double the current size+1;
    public void ensureCapacity(int minCapacity)
    {
        if(minCapacity>=elements.length)
        {
            E [] newElement =(E[])new Object[2*size+1];
            System.arraycopy(elements,0,newElement,0,size);
            elements = newElement;
        }
    }
    public E remove(int index)
    {
        checkIndex(index);
        E e = elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return e;
    }
    public E get(int i)
    {
        checkIndex(i);
        return elements[i];
    }
    public void checkIndex(int index)
    {
        if(index<0||index>=size)
        {
            throw new IndexOutOfBoundsException("I");
        }
    }
    boolean add (E e)
    {
        if(size>=elements.length)
        {
            return false;
        }
        return true;
    }
    public int size()
    {
        return size;
    }
    public boolean contains(E o)
    {
        for (int i = 0; i < size; i++) {
            if(o.equals(elements[i]))
            {
                return true;
            }

        }
        return false;
    }
    public int indexOf(E o)
    {
        for (int i = 0; i < size; i++) {
            if(o.equals(elements[i]))
            {
                return i;
            }
        }
        return 0;
    }
    public void clear()
    {
        size=0;
       elements = (E[])new Object[DEFAULT_CAPACITY];
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public int LastIndexOf(E o)
    {
        for (int i = size-1; i >= 0; i--) {
            if(o.equals(elements[i]))
            {
                return i;
            }
        }
        return 0;
    }


   
}
