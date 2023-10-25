package _10_dsa_danhsach.exercise.e1;

public class MyListTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyList<Integer>myList = new MyList<Integer>(10);
        myList.add(0,5);
        myList.add(1,4);
        myList.add(2,3);
        myList.add(3,3);
        myList.add(4,3);
        System.out.println("size ban dau la :"+myList.size());
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println("5 co chua trong  myList ko : "+myList.contains(5));
        System.out.println("index cua 3 la : "+myList.indexOf(3));
        System.out.println(myList.remove(0));
        System.out.println("size sau khi xoa la :"+myList.size());
        MyList<Integer> c = (MyList<Integer>) myList.clone();
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i)+" ");
        }
        System.out.println("mang sau khi clone");
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i)+" ");
        }
    }
}
