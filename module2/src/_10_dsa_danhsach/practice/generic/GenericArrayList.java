package _10_dsa_danhsach.practice.generic;

public class GenericArrayList<T>{
    private static final int INITIAL_SIZE= 16;
    private T [] elements;
    private int count=0;

    public GenericArrayList() {
        this.elements = (T[]) new Object[INITIAL_SIZE];
    }
    public void add(T element)
    {
        this.elements[count++]=element;
    }
}
