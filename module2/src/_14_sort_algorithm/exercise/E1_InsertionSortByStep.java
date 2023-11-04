package _14_sort_algorithm.exercise;

public class E1_InsertionSortByStep {
    public static void main(String[] args) {
        int [] list = new int []{1,2,8,5,3};
        System.out.println("mang truoc khi sort");
        for (int j = 0; j < list.length ; j++) {
            System.out.print(list[j]+" ");
        }
        System.out.println();
        System.out.println("mang sau khi sort");
        insertionSortByStep(list);
    }
    public static void insertionSortByStep(int []list)
    {
        int pos,x;
        int count=0;
        for (int i = 0; i < list.length; i++) {
            pos=i;
            x=list[i];
          //  nextpassSort=false;
            while (pos>0&&x<list[pos-1])
            {
                System.out.println("Swap "+list[pos]+" and "+list[pos-1]);
                list[pos]=list[pos-1];
                pos--;
            }
                list[pos]=x;
            count++;
            if(count!=0)
            {
                System.out.println("buoc "+count);
                for (int j = 0; j < list.length ; j++) {

                    System.out.print(list[j]+" ");
                }
                System.out.println();
            }


        }
    }
}
