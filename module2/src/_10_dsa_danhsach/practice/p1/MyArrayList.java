package _10_dsa_danhsach.practice.p1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyArrayList<E> extends MyAbstractList<E>{
    public static final int INITIAL_CAPACITY=16;
    private E[] data = (E[])new Object[INITIAL_CAPACITY];
    // Create a default list
    public MyArrayList()
    {

    }
    //create a list from an array of objects
    public MyArrayList(E[] objects)
    {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);//// Warning: don't use super(objects)!
        }
    }
    @Override
    // add a new element at the specified index
    public void add(int index, E e) {
        ensureCapacity();
        // move the elements to the right after the specified index
        for (int i = size-1; i >=index ; i--) {
            data[i+1] = data[i];
        }
        //insert new element to data[index]
        data[index]=e;
        // increase size by 1;
        size++;
    }
// create a new larger array, double the current size +1
    private void ensureCapacity() {
        if(size>=data.length)
        {
            E[] newData = (E[]) (new Object[size*2+1]);
            System.arraycopy(data,0,newData,0,size);
            data = newData;
        }
    }

    @Override
    public void clear() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size =0;
    }
    //return true if this list contains the element
    @Override
    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(data[i]))
            {
                return true;
            }
        }
        return false;
    }

    /** Return the element at the specified index */
    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if(index<0||index>=size)
        {
            throw  new IndexOutOfBoundsException("index"+ index+"out of bounds");
        }
    }

    @Override
    // return the index of the first matching element in this list.Return -1 if no match
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(data[i]))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    // return the index of the last matching element in this list.Return -1 if no match
    public int lastIndexOf(E o) {
        for (int i = size-1; i >=0 ; i--) {
            if(o.equals(data[i]))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    /** Remove the element at the specified position 84 * in this list. Shift any subsequent elements to the left. 85 * Return the element that was removed from the list. */
    public E remove(int index) {
        checkIndex(index);
        E e = data[index];
        // shift data to the left
        for (int i = index; i < size-1 ; i++) {
            data[i] = data[i+1];
        }
        data[size-1] = null;//this element is now null;
        //decrement size
        size--;
        return e;
    }

    @Override
    /** Replace the element at the specified position
     *  in this list with the specified element. */
    public E set(int index, E o) {
        checkIndex(index);
        E old = data[index];
        data[index]= o;
        return old;
    }

    @Override
    public String toString() {
       StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if(i<size-1) result.append(",");
        }
        return result.toString()+"]";
    }

    /**
     * Trims the capacity to current size
     */
    public void trimToSize() {

        if (size != data.length) {
            E[] newData = (E[]) (new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        } // If size == capacity, no need to trim
    }

    @Override
    /** Override iterator() defined in Iterable */
    public java.util.Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements java.util.Iterator {
        private int current = 0; // Current index

        @Override
        public boolean hasNext() {
            return (current < size);
        }

        @Override
        public E next() {
            return data[current++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(current);
        }
    }
}

