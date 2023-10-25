package _10_dsa_danhsach.practice.p1;

public interface MyList <E> extends java.lang.Iterable<E>{
    public void add(E e);
    public void add(int index,E e);
    public void clear();
    public E get(int index);
    public int indexOf(E e);
    public boolean remove(E e);
    public int lastIndexOf(E e);
    public E remove(int index);
    public Object set(int index,E e);
    public  int size();
    public boolean isEmpty();
    public boolean contains(E e);
}
