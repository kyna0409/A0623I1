package _14_arrange_algorithm.exercise;

public class E2_InsertionSort {
    public static void main(String[] args) {
        int [] list = new int []{1,2,8,5,3};
        insertionSort(list);
        for (int j = 0; j < list.length ; j++) {
            System.out.print(list[j]+" ");
        }
    }
    public static void insertionSort(int [] list)
    {
        int pos,x;
        for (int i = 0; i < list.length; i++) {
            pos=i;
            x=list[i];
            while (pos>0&&x<list[pos-1])
            {
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=x;

        }


    }
}
