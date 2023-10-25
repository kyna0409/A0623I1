package _10_dsa_danhsach.exercise.e2;

public class MyLinkedListTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyLinkedList<String> myLinkedList= new MyLinkedList<>();
        myLinkedList.addFirst("java");
        myLinkedList.addFirst("javaScript");
        myLinkedList.addLast("python");
        myLinkedList.add(1, "c++");

        System.out.println(myLinkedList.contains("java"));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.contains("2"));
        System.out.println(myLinkedList.indexOf("c++"));
        System.out.println("truoc khi xoa");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
        myLinkedList.removeFirst();
        myLinkedList.remove(0);
        System.out.println("sau khi xoa");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
        System.out.println("mang sau khi clone");
            MyLinkedList<String> tmp= (MyLinkedList<String>) myLinkedList.clone();
            int size= tmp.size();
            for (int i = 0; i < size; i++) {
                System.out.println(tmp.get(i));
            }
   }
}
